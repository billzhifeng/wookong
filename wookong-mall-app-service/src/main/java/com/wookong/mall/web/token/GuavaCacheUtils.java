package com.wookong.mall.web.token;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * google guava cache 缓存
 */
@Service
public class GuavaCacheUtils {
	
	 private static final Logger logger = LoggerFactory.getLogger(GuavaCacheUtils.class);
	 
	 //@Value("#{configProperties['key']}")
	 @Value("${user.login.token.expire}")
	 private Integer userLoginTokenExpire = 180;

	 /**
	 * 缓冲
	 */
	 private LoadingCache<String, String> cache = null;
	 
    /**
     * 加载一个默认缓冲,用于测试
     */
    private class TokenCacheLoader extends CacheLoader<String, String> {
        @Override
        public String load(String key) throws Exception {
            return "TEST_USER_ID_111";
        }
    }
	
	private LoadingCache<String, String> getCache() {
		
		if(null!=cache) {
			return cache;
		}
		
		synchronized (GuavaCacheUtils.class) {
			cache = CacheBuilder.newBuilder()
                //设置并发级别为8，并发级别是指可以同时写缓存的线程数
                .concurrencyLevel(8)
                //设置缓存容器的初始容量为10
                .initialCapacity(1000)
                //设置缓存最大容量为100，超过100之后就会按照LRU最近虽少使用算法来移除缓存项
                .maximumSize(10000000)
                //是否需要统计缓存情况,该操作消耗一定的性能,生产环境应该去除
                //.recordStats()
                //设置写缓存后n分钟过期
                .expireAfterWrite(userLoginTokenExpire, TimeUnit.MINUTES)
                //设置读写缓存后n秒钟过期,实际很少用到,类似于expireAfterWrite
                //.expireAfterAccess(17, TimeUnit.SECONDS)
                //只阻塞当前数据加载线程，其他线程返回旧值
                //.refreshAfterWrite(13, TimeUnit.SECONDS)
                //设置缓存的移除通知
                .removalListener(notification -> {
                	logger.info("GUAVA_CACHE--> "+notification.getKey() + " : " + notification.getValue() + " 被移除,原因:" + notification.getCause());
                })
                .build(new TokenCacheLoader());
		}
		return cache;
	}
	
    public void viewCacheStatus() {
        //缓存状态查看
        logger.info("GUAVA_STATUS-> "+getCache().stats().toString());
    }
    
    public void put(String key,String value) {
    	getCache().put(key, value);
    }
    
    public String get(String key) {
    	return getCache().getUnchecked(key);
    }


}