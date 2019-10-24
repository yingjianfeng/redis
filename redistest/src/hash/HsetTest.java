package hash;

import redis.clients.jedis.Jedis;

public class HsetTest {
	public static void main(String[] args) {
		Jedis jedis = new Jedis();
		jedis.hset("hash", "k1", "v1");
		String v1 = jedis.hget("hash", "k1");
		System.out.println(v1);
	}
}
