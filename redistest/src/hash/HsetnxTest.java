package hash;

import redis.clients.jedis.Jedis;

public class HsetnxTest {
	public static void main(String[] args) {
		Jedis jedis = new Jedis();
		System.out.println(jedis.hget("hash", "k1"));
		Long res = jedis.hsetnx("hash", "k1", "123");
		System.out.println(res);
		System.out.println(jedis.hget("hash", "k1"));
		
	}
}
