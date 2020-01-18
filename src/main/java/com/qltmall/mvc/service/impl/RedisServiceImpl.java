package com.qltmall.mvc.service.impl;

import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import com.qltmall.mvc.service.RedisService;


@Service
public class RedisServiceImpl implements RedisService{

	@Autowired
	private StringRedisTemplate stringredistemplate;
	
	@Override
	public void set(String key, String value) {
		stringredistemplate.opsForValue().set(key, value);
		
	}

	@Override
	public String get(String key) {
		return stringredistemplate.opsForValue().get(key);
	}

	@Override
	public boolean expire(String key, long expire) {
		return stringredistemplate.expire(key, expire, TimeUnit.SECONDS);
	}

	@Override
	public void remove(String key) {
		stringredistemplate.delete(key);
	}

	@Override
	public Long increment(String key, long delta) {
		return stringredistemplate.opsForValue().increment(key, delta);
	}

}
