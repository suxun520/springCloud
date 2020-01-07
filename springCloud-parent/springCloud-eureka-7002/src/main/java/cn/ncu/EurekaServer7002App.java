package cn.ncu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer // eureka服务端自动配置
public class EurekaServer7002App {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServer7002App.class, args);
	}
}
