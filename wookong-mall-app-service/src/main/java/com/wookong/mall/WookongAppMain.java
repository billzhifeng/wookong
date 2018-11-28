
package com.wookong.mall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动入口
 * 
 * @author bill
 */
@SpringBootApplication
//@MapperScan({ "com.wookong.mall.dal.dao" })
public class WookongAppMain {

    public static void main(String[] args) {
        SpringApplication.run(WookongAppMain.class, args);
    }

}
