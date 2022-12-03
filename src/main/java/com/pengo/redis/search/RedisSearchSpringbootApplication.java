package com.pengo.redis.search;

import com.redis.om.spring.annotations.EnableRedisDocumentRepositories;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableRedisDocumentRepositories(basePackages = "com.pengo.redis.search.*")
@SpringBootApplication
public class RedisSearchSpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(RedisSearchSpringbootApplication.class, args);
    }

}
