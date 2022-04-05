package com.rindus;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.rindus.consts.ModelConsts;
import com.rindus.repository.ModelRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = RindusLogisticRegChallengeApplication.class)

class RindusLogisticRegChallengeApplicationTests {
	@Autowired
	ModelRepository modelRepository;
	@Autowired
	JedisConnectionFactory conection;

	@Test
	void testRedisConection() {

		Assert.assertEquals(conection.getHostName(), "localhost");
		Assert.assertEquals(conection.getPort(), 6379);
		conection.getConnection();
	}

	@Test
	void contextLoads() {
		Map<String, String> reg = new HashMap<>();

		reg.put("deviceExtBrowser", "Firefox");
		reg.put("bannerExtSize", "300x250");
		reg.put("deviceLanguage", "de");
		reg.put("deviceExtType", "tablet");

		System.out.println(modelRepository.calculateRegresionCoef(reg));
		Assert.assertEquals(0.0016306374, modelRepository.calculateRegresionCoef(reg), ModelConsts.DELTA);
	}

}
