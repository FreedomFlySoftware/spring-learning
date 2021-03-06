package com.zxd.spring.test.learning.event.handler.custom;

import org.springframework.context.ApplicationListener;

/**
 * @author CoderZZ
 * @Title: ${FILE_NAME}
 * @Project: springlearning
 * @Package com.zxd.spring.test.learning.event.handler.custom
 * @description: TODO:一句话描述信息
 * @Version 1.0
 * @create 2018-06-07 0:23
 **/
public class CustomEventHandler implements ApplicationListener<CustomEvent>{
    /**
     * Handle an application event.
     *
     * @param event the event to respond to
     */
    public void onApplicationEvent(CustomEvent event) {
        System.out.println(event.toString());
    }
}
