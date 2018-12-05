package com.wookong.mall.web.token;

import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.http.client.utils.DateUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.CollectionUtils;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import com.auth0.jwt.interfaces.Claim;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.github.java.common.base.BaseException;
import com.github.java.common.utils.DateUtil;
import com.github.java.common.utils.JavaAssert;
import com.github.java.common.utils.StringUtils;
import com.wookong.mall.common.dto.UserDTO;
import com.wookong.mall.common.enums.ReturnCode;

/**
 * 基于JWT前后端token认证工具类
 * 参考实现https://blog.csdn.net/luckey_zh/article/details/61197587
 */
public class TokenHelper {
    private static final Logger logger = LoggerFactory.getLogger(TokenHelper.class);

    public static void main(String[] args) {
        
        String token = getToken(123456789L,"bill");
        System.out.println(token);
        
        verifyToken(token);
    }
    
    private static final String SECRET = "wookong_secret";

    public static String getToken(Long userId,String loginName) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("alg", "HS256");
        map.put("typ", "JWT");
        String token = null;
        try {
            token = JWT.create().withHeader(map)//header
                    .withClaim("userId", userId.intValue())//payload
                    .withClaim("loginName", loginName)//payload
                    //.withClaim("startTime", DateUtil.formatDate(new Date(), DateUtil.longFormat))//payload
                    .sign(Algorithm.HMAC256(SECRET));//签证信息加密
        } catch (IllegalArgumentException | JWTCreationException | UnsupportedEncodingException e) {
            logger.error("生成token异常,userId:{},loginName:{}", userId, loginName);
            throw new BaseException(ReturnCode.SYSTEM_ERROR, "生成token异常");
        }
        return token;
    }
    
    /**
     * token 60分钟后过期
     */
    static final int tokenExpireMinutes = 60;
    
    /**
     * 验证token信息，并获得user,token 一小时失效,有效期内自动延长
     * @param token
     * @return
     */
    public static UserDTO verifyToken(String token)  {
        try {
            //TODO 服务端找该token，找不到失效或伪造token
            
            JWTVerifier verifier = JWT.require(Algorithm.HMAC256(SECRET)).build();
            DecodedJWT jwt = verifier.verify(token);
            Map<String, Claim> claims = jwt.getClaims();
            JavaAssert.isTrue(!CollectionUtils.isEmpty(claims), ReturnCode.NOT_LOGIN, "未登录", BaseException.class);
            JavaAssert.isTrue(StringUtils.isNotBlank(claims.get("loginName").asString()), ReturnCode.NOT_LOGIN, "未登录", BaseException.class);
            JavaAssert.isTrue(null != claims.get("userId").asInt(), ReturnCode.NOT_LOGIN, "未登录", BaseException.class);
            
//            String startTimeStr = claims.get("startTime").asString();
//            try {
//                Date startDate = DateUtil.parseDate(startTimeStr, DateUtil.longFormat);
//                long diffMinutes = DateUtil.getDiffMinutes(new Date(),startDate);
//                JavaAssert.isTrue(tokenExpireMinutes>diffMinutes, ReturnCode.NOT_LOGIN, "登录失效,请重新登录", BaseException.class);
//            
//                //过半自动延时
//                if(diffMinutes>(tokenExpireMinutes/2)){
//                     //TODO 刷新服务端token缓冲有效时间为：当前时间+tokenExpireMinutes
//                }
//            } catch (ParseException e) {
//                logger.error("验证token异常,时间格式不对,token:{}", token);
//                throw new BaseException(ReturnCode.PARAM_ILLEGLE, "token格式异常");
//            }
            
            UserDTO user = new UserDTO();
            user.setId(claims.get("userId").asInt().longValue());
            user.setLoginName(claims.get("loginName").asString());
            return user;
        } catch (IllegalArgumentException | UnsupportedEncodingException e) {
            logger.error("验证token异常,token:{}", token);
            throw new BaseException(ReturnCode.SYSTEM_ERROR, "验证token异常");
        }
    }

}
