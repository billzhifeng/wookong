package com.wookong.mall.web.token;

import java.io.IOException;
import java.util.Map;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.filter.GenericFilterBean;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.Claim;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.github.java.common.base.BaseException;
import com.wookong.mall.common.dto.UserDTO;
import com.wookong.mall.common.enums.ReturnCode;

/**
 * jwt登录token拦截器
 */
public class JwtFilter extends GenericFilterBean {
    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public void doFilter(final ServletRequest req, final ServletResponse res, final FilterChain chain)
            throws IOException, ServletException {
        final HttpServletRequest request = (HttpServletRequest) req;

        //客户端将token封装在header请求头中,格式为Authorization={token}
        final String authHeaderToken = request.getHeader("Authorization");
        if (authHeaderToken == null) {
            logger.error("jwt拦截header中Authorization为空");
            throw new BaseException(ReturnCode.NOT_LOGIN, "Missing or invalid Authorization header.");
        }

        //解密token，拿到里面的对象claims,并获得user
        UserDTO user = TokenHelper.verifyToken(authHeaderToken);
        
        //将对象传递给下一个请求
        request.setAttribute("user", user);

        chain.doFilter(req, res);
    }

}
