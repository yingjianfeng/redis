package string;

import redis.clients.jedis.Jedis;

public class MsetTest {
	public static void main(String[] args) {
		Jedis jedis = new Jedis();
		jedis.mset("k1","v1","k2","v2");
		System.out.println(jedis.get("k1"));
		System.out.println(jedis.get("k2"));
	}
}
