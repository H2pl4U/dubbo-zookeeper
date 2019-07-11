package com.dubboprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 1 将服务提供者注册到服务
 *  1.引入dubbo和zkclient相关依赖
 *  2.配置dubbo的扫描包和注册中心地址
 *  3.使用@Service发布服务
 */
@SpringBootApplication
public class DubboProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboProviderApplication.class, args);
    }

}
