package com.wookong.mall.configuration.common;

import java.io.IOException;
import java.sql.Timestamp;

import javax.annotation.PostConstruct;

import org.apache.http.NoHttpResponseException;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultHttpRequestRetryHandler;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.protocol.HttpContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.core.convert.converter.Converter;
import org.springframework.core.convert.support.GenericConversionService;
import org.springframework.web.bind.support.ConfigurableWebBindingInitializer;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * common类里的spring相关bean定义在这里
 */
@Order(10)
@Configuration
@EnableSwagger2
@EnableConfigurationProperties({ HttpClientProperties.class})
public class CommonConfiguration {

    private final static Logger          logger = LoggerFactory.getLogger(CommonConfiguration.class);
    @Autowired
    private RequestMappingHandlerAdapter handlerAdapter;

    @Autowired
    private HttpClientProperties         httpClientProperties;
    
    
    @Bean
    @ConditionalOnMissingBean(SpringContextHolder.class)
    @ConditionalOnExpression("${spring-context-holder-enable:false}")
    public SpringContextHolder springContextHolder(ApplicationContext applicationContext) {
        return new SpringContextHolder(applicationContext);
    }
    
    /**
     ** 转换器：数字转日期
     */
    @PostConstruct
    public void initEditableValidation() {
        ConfigurableWebBindingInitializer initializer = (ConfigurableWebBindingInitializer) handlerAdapter
                .getWebBindingInitializer();
        if (initializer.getConversionService() != null) {
            GenericConversionService genericConversionService = (GenericConversionService) initializer
                    .getConversionService();
            class String2TimestampConverter implements Converter<Long, Timestamp> {
                @Override
                public Timestamp convert(Long time) {
                    return new Timestamp(time);
                }
            }
            genericConversionService.addConverter(new String2TimestampConverter());
        }

    }

    //使用方式    @Autowired  private HttpClient          httpClient;
    @Bean(destroyMethod = "close")
    @ConditionalOnProperty(name = "http.client.connectTimeout", matchIfMissing = false)
    public CloseableHttpClient initHttpClient() {
        RequestConfig requestConfig = RequestConfig.custom().setConnectTimeout(httpClientProperties.getConnectTimeout())
                .setConnectionRequestTimeout(httpClientProperties.getConnectTimeout())
                .setSocketTimeout(httpClientProperties.getReadTimeout()).build();

        CloseableHttpClient httpClient = HttpClients.custom().setDefaultRequestConfig(requestConfig)
                .setMaxConnTotal(httpClientProperties.getMaxConnTotal())
                .setMaxConnPerRoute(httpClientProperties.getMaxConnPerRoute())
                .setRetryHandler(new DefaultHttpRequestRetryHandler() {
                    @Override
                    public boolean retryRequest(IOException exception, int executionCount, HttpContext context) {
                        boolean isRetry = super.retryRequest(exception, executionCount, context);
                        if (isRetry) {
                            return isRetry;
                        }
                        if (executionCount > super.getRetryCount()) {
                            return isRetry;
                        }
                        if (exception instanceof NoHttpResponseException) {
                            return true;
                        }
                        return isRetry;
                    }
                }).build();
        // JVM shutdown时释放资源
        Runtime run = Runtime.getRuntime();
        run.addShutdownHook(new Thread() {
            @Override
            public void run() {
                logger.info("release http client resource begin ...");
                try {
                    httpClient.close();
                } catch (IOException e) {
                    logger.info("IO异常", e);
                }
                logger.info("release http client resource end ...");
            }
        });
        return httpClient;
    }

    @Bean
    @ConditionalOnMissingBean(Docket.class)
    @ConditionalOnExpression("${swagger-enable:false}")
    public Docket buildDocket() {
        ApiInfo apiInfo = new ApiInfoBuilder().title("Spring Boot中使用Swagger2 UI构建API文档").contact("COM").version("1.0")
                .build();
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo).select()
                .apis(RequestHandlerSelectors.basePackage("com")) // 要扫描的API(Controller)基础包
                .paths(PathSelectors.any()).build();
    }

//    @Bean
//    @ConditionalOnMissingBean(CuratorFramework.class)
//    @ConditionalOnProperty(name = "zookeeper.connect-string", matchIfMissing = false)
//    public CuratorFramework curatorFramework() {
//        final CuratorFramework client = CuratorFrameworkFactory.newClient(this.zookeeperProperties.getConnectString(),
//                zookeeperProperties.getSessionTimeoutMs(), 4000, new ExponentialBackoffRetry(1000, 3));
//        client.start();
//        //优雅关闭：系统关闭时候，监听关闭，处理完成任务后关闭
//        Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
//
//            @Override
//            public void run() {
//                client.close();
//            }
//        }));
//        return client;
//    }
}
