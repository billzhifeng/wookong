
package com.wookong.mall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

import com.wookong.mall.web.token.JwtFilter;

/**
 * 启动入口
 * 
 * @author bill
 */
@SpringBootApplication
public class WookongAppMain {

    //登录token拦截过滤器
    @Bean
    public FilterRegistrationBean jwtFilter() {
        final FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        registrationBean.setFilter(new JwtFilter());
        //registrationBean.addUrlPatterns("/api/*");
        registrationBean.addUrlPatterns(new String[]{"/order/*","/user/*","/pay/*","/refund/*"});
        return registrationBean;
    }
    
    public static void main(String[] args) {
        SpringApplication.run(WookongAppMain.class, args);
    }

}
