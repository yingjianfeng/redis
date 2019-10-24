package hash;

import redis.clients.jedis.Jedis;

public class HlenTest {
	public static void main(String[] args) {
		Jedis jedis = new Jedis();
		jedis.hset("hash", "k1", "v1");
		jedis.hset("hash", "k2", "v2");
		jedis.hset("hash", "k3", "v3");
		Long len = jedis.hlen("hash");
		System.out.println(len);
	}
}
