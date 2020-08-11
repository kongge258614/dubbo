package org.apache.dubbo.demo.consumer.config;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @Author liliang
 * @Date 2020/8/11 16:14
 * @Description
 **/

@Configuration
@EnableDubbo(scanBasePackages = "org.apache.dubbo.demo.consumer.comp")
@PropertySource("classpath:/spring/dubbo-consumer.properties")
@ComponentScan(value = {"org.apache.dubbo.demo.consumer.comp"})
public class ConsumerConfiguration {
}
