package com.wookong.mall.controller.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试controller
 * 
 * @author bill
 */
@RestController
public class ClientTestController {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @RequestMapping(value = "/CLIENT", method = RequestMethod.GET)
    public String sayOK() {
        return "CLIENT";
    }

}
