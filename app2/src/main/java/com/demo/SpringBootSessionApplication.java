package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

@SpringBootApplication
@EnableRedisHttpSession
public class SpringBootSessionApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSessionApplication.class, args);
	}
}
//	@Bean
//	public LettuceConnectionFactory connectionFactory() {
//		return new LettuceConnectionFactory();
//	}
//}