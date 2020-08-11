package org.apache.dubbo.demo.provider.config;

import org.apache.dubbo.config.RegistryConfig;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @Author liliang
 * @Date 2020/8/11 16:13
 * @Description
 **/

@Configuration
@EnableDubbo(scanBasePackages = "org.apache.dubbo.demo.provider")
@PropertySource("classpath:/spring/dubbo-provider.properties")
public class ProviderConfiguration {
    @Bean
    public RegistryConfig registryConfig() {
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setAddress("nacos://127.0.0.1:8848");
        return registryConfig;
    }
}
