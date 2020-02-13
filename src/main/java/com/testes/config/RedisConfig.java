///*
// * Copyright (C) 2018 royal Inc., All Rights Reserved.
// */
//package com.testes.config;
//
//import org.springframework.cache.CacheManager;
//import org.springframework.cache.annotation.CachingConfigurerSupport;
//import org.springframework.cache.annotation.EnableCaching;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.redis.cache.RedisCacheManager;
//import org.springframework.data.redis.connection.RedisConnectionFactory;
//import org.springframework.data.redis.core.RedisTemplate;
//import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
//import org.springframework.data.redis.serializer.StringRedisSerializer;
//
///**
// * @Description: springBoot2.0 redis配置 https://www.cnblogs.com/wscy/p/9241747.html
// * @Author: niuyibo
// * @Date: 创建时间 2018年10月12日 下午2:34:27
// *
// */
//@Configuration
//@EnableCaching
//public class RedisConfig extends CachingConfigurerSupport {
//	@Bean
//	public CacheManager cacheManager(RedisConnectionFactory connectionFactory) {
//		RedisCacheManager redisCacheManager = RedisCacheManager.builder(connectionFactory).build();
//		return redisCacheManager;
//	}
//
//	@Bean
//	public RedisTemplate<Object, Object> redisTemplate(RedisConnectionFactory redisConnectionFactory) {
//		RedisTemplate<Object, Object> redisTemplate = new RedisTemplate<>();
//		redisTemplate.setConnectionFactory(redisConnectionFactory);
//		// key序列化
//		redisTemplate.setKeySerializer(new StringRedisSerializer());
//		// value序列化
//		redisTemplate.setValueSerializer(new Jackson2JsonRedisSerializer(Object.class));
//		redisTemplate.afterPropertiesSet();
//		return redisTemplate;
//	}
//}
