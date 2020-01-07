package cn.ncu.config;

import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MybatisConfig {

	// 主配置文件 和javaConfig不能共存！！！！！！！
//	@Bean
	public ConfigurationCustomizer configurationCustomizer() {
		return new ConfigurationCustomizer() {

			@Override
			public void customize(org.apache.ibatis.session.Configuration configuration) {
				// 开启驼峰命名
				configuration.setMapUnderscoreToCamelCase(true);

				// 缓存
				configuration.setCacheEnabled(true);
			}
		};
	}
}
