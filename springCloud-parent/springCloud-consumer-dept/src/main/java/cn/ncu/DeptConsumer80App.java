package cn.ncu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

import cn.MySelfRule;

@SpringBootApplication
@EnableEurekaClient
//在启动该微服务时能去加载我们自定义的ribbon配置类，从而使配置生效    注意   该配置类不能与启动类放在同一个包及子包下
@RibbonClient(name = "SPRINGCLOUD-DEPT",configuration = MySelfRule.class)
public class DeptConsumer80App {
   
	
	
	   public static void main(String[] args) {
		SpringApplication.run(DeptConsumer80App.class, args);
	}
	
	
}
