package com.rindus.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.JdkSerializationRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

import com.rindus.model.Model;

@Configuration

public class AppConfig {
	
	/*
	@Bean
    JedisConnectionFactory jedisConnectionFactory() {
		 JedisConnectionFactory factory = new JedisConnectionFactory();
		 factory.getPoolConfig().setMaxIdle(30);
		 factory.getPoolConfig().setMinIdle(10);
		  return factory;    }

    @Bean
    RedisTemplate<String, Model> redisTemplate() {
        final RedisTemplate<String, Model> redisTemplate = new RedisTemplate<>();
        redisTemplate.setConnectionFactory(jedisConnectionFactory());
        return redisTemplate;
    }*/
	/*
    @Bean 
	JedisConnectionFactory jedisConnectionFactory() {
	    RedisStandaloneConfiguration redisStandaloneConfiguration = new RedisStandaloneConfiguration("localhost", 6379);
	    redisStandaloneConfiguration.setPassword(RedisPassword.of("yourRedisPasswordIfAny"));
	    return new JedisConnectionFactory(redisStandaloneConfiguration);
	}
    
    @Bean
    RedisTemplate<String,Model> redisTemplate(){
    	final RedisTemplate<String,Model> redisTemplate=new RedisTemplate<>(); 
    	redisTemplate.setConnectionFactory(jedisConnectionFactory());
    	return redisTemplate;
    }
    */
    /*
    @Bean
    public LettuceConnectionFactory redisConnectionFactory() {

      return new LettuceConnectionFactory(new RedisStandaloneConfiguration("localhost", 6379));
    }*/
	
	
	
	
	/*
	@Bean
    public JedisConnectionFactory jedisConnectionFactory() {
        RedisStandaloneConfiguration redisStandaloneConfiguration = new RedisStandaloneConfiguration();
        redisStandaloneConfiguration.setHostName("127.0.0.1");
        redisStandaloneConfiguration.setPort(6379);
        //redisStandaloneConfiguration.setPassword("password");

        JedisConnectionFactory jedisConnectionFactory = new JedisConnectionFactory(redisStandaloneConfiguration);
        return  jedisConnectionFactory;
    }

    @Bean
    public RedisTemplate<String, Object> redisTemplate() {
        RedisTemplate<String, Object> redisTemplate = new RedisTemplate<>();
        redisTemplate.setConnectionFactory(jedisConnectionFactory());
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        redisTemplate.setHashKeySerializer(new StringRedisSerializer());
        redisTemplate.setHashKeySerializer(new JdkSerializationRedisSerializer());
        redisTemplate.setValueSerializer(new JdkSerializationRedisSerializer());
        redisTemplate.setEnableTransactionSupport(true);
        redisTemplate.afterPropertiesSet();
        return redisTemplate;
    }*/
	
	
	@Bean
	JedisConnectionFactory jedisConnectionFactory() {
	    return new JedisConnectionFactory();
	}

	@Bean
	public RedisTemplate<String, Object> redisTemplate() {
	    RedisTemplate<String, Object> template = new RedisTemplate<>();
	    template.setConnectionFactory(jedisConnectionFactory());
	    return template;
	}
    
}
