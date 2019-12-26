package cn.ncu.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class BeanConfig {
    
	//restTemplate用来访问http  rest请求的模板
	 @Bean
	 public  RestTemplate   restTemplate() {
		 return new   RestTemplate();
	 }
	
}
