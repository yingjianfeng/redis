package string;

import redis.clients.jedis.Jedis;

public class MsetnxTest {
	public static void main(String[] args) {
		Jedis jedis = new Jedis();
		jedis.msetnx("k1","v1","k2","v2");
		System.out.println(jedis.get("k1"));
		System.out.println(jedis.get("k2"));
		jedis.msetnx("k1","v11111","k3","v3");
		System.out.println(jedis.get("k3"));
	}
}
