package com.wookong.mall.configuration.client;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

/**
 * 跨域
 * 
 * @Configuration
 * @author bill
 * @date 2018年12月4日 上午9:48:10
 */
@Configuration
public class CorsConfiguration {

    private final static Logger LOGGER = LoggerFactory.getLogger(CorsConfiguration.class);

    @Value("${allow.Origin.ip}")
    private String              allowOriginIp;

    private org.springframework.web.cors.CorsConfiguration buildConfig() {
        org.springframework.web.cors.CorsConfiguration corsConfiguration = new org.springframework.web.cors.CorsConfiguration();
        corsConfiguration.setAllowedOrigins(Arrays.asList(allowOriginIp.split(",")));
        corsConfiguration.addAllowedHeader("*");
        corsConfiguration.addAllowedMethod("*");
        corsConfiguration.setAllowCredentials(true);
        return corsConfiguration;
    }

    @Bean
    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", buildConfig());
        return new CorsFilter(source);
    }

}
