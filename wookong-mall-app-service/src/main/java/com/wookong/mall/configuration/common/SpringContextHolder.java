package com.wookong.mall.configuration.common;

import java.util.Map;

import org.springframework.context.ApplicationContext;

/**
 * springHolder
 */
public class SpringContextHolder {

    private static ApplicationContext applicationContext;

    /**
     **  取得存储在静态变量中的ApplicationContext.
     * @return
     */
    public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    // 从静态变量ApplicationContext中取得Bean, 自动转型为所赋值对象的类型.
    // 如果有多个Bean符合Class, 取出第一个.
    @SuppressWarnings("unchecked")
    public static <T> T getBean(Class<T> clazz) {
        @SuppressWarnings("rawtypes")
        Map beanMaps = applicationContext.getBeansOfType(clazz);
        if (beanMaps != null && !beanMaps.isEmpty()) {
            return (T) beanMaps.values().iterator().next();
        } else {
            return null;
        }
    }

    // 按名字获取BEAN
    @Deprecated
    public static <T> T getBean(String name, Class<T> clazz) {
        return applicationContext.getBean(name, clazz);
    }

    @SuppressWarnings("unchecked")
    public static <T> T getBeanByName(String name, Class<T> clazz) {
        @SuppressWarnings("rawtypes")
        Map beanMaps = applicationContext.getBeansOfType(clazz);
        return (T) beanMaps.get(name);
    }

    public SpringContextHolder(ApplicationContext arg0) {
        applicationContext = arg0;
    }
}
