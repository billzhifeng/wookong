package com.wookong.mall.controller.admin;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;

/**
 * 测试controller
 * 
 * @author bill
 */
@Controller
public class AdminController {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @RequestMapping(value = "/ADMIN", method = RequestMethod.GET)
    @ResponseBody
    public String sayOK() {
        return "ADMIN";
    }

}
