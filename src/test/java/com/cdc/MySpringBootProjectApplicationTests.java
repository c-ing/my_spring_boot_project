package com.cdc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import redis.clients.jedis.Jedis;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MySpringBootProjectApplicationTests {

	@Test
	public void contextLoads() {

		Jedis jedis  = new Jedis("loclhost",6379);
	}

}
