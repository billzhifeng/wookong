package com.wookong.mall.facade;

import com.github.java.common.base.BaseResp;
import com.wookong.mall.facade.req.SayHiReq;
/**
 * 
 * @author Administrator
 *
 */
public interface SayHiFacade {

    public BaseResp sayHi(SayHiReq req);
}
