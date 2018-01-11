package com.sxc.fukuoka.zhihu.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Provider {

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] {"provider.xml"});
        context.start();
        // press any key to exit
        System.in.read();
    }
}
