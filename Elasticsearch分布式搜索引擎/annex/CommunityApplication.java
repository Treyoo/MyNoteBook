package com.nowcoder.community;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class CommunityApplication {

    @PostConstruct  //这个注解是用来管理Bean的生命周期的，主要用来管理Bean的初始化的方法，
					//由这个注解修饰的方法会在执行完Bean(这里就是启动类)的构造方法后被执行
    public void init() {
        // 解决netty启动冲突问题
        // 解决办法出处： Netty4Utils.setAvailableProcessors()
        System.setProperty("es.set.netty.runtime.available.processors", "false");
    }

    public static void main(String[] args) {
        SpringApplication.run(CommunityApplication.class, args);
    }

}
