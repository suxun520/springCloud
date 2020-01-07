package cn;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;

@Configuration
public class MySelfRule {
  
	
	//需求  在轮询的基础上  每个使用5次轮询下一个
	@Bean
	public  IRule   iRule() {
		return  new   SelfLoadBanlanceRule();
	}
}
