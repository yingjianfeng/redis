package string;

import redis.clients.jedis.Jedis;

public class SetexTest {
	public static void main(String[] args) {
		Jedis jedis = new Jedis();
		String res = jedis.setex("k1", 30, "v1");
		System.out.println(res);
		Long seconds = jedis.ttl("k1");
		System.out.println(seconds);
	}
}
