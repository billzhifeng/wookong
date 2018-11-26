package com.wookong.mall.facade.impl;

import com.github.java.common.base.BaseResp;
import com.wookong.mall.facade.SayHiFacade;
import com.wookong.mall.facade.req.SayHiReq;

/**
 * 样例
 * 
 * @author bill
 * @date 2018年11月27日 下午9:44:26
 */
public class SayHiFacadeImpl implements SayHiFacade {

    @Override
    public BaseResp sayHi(SayHiReq req) {
    	BaseResp resp = BaseResp.buildSuccessResp(BaseResp.class);
        resp.setData("HI " + req.getName());
        return resp;
    }

}
