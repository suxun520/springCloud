package cn.ncu.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class BeanConfig {
    
	//restTemplate用来访问http  rest请求的模板
	 @Bean
	 //restTemplate是客户端工具  此处可以理解为以客户端的角度开启负载均衡
	 @LoadBalanced
	 public  RestTemplate   restTemplate() {
		 return new   RestTemplate();
	 }
	
}
