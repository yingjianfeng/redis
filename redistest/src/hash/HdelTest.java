package hash;

import redis.clients.jedis.Jedis;

public class HdelTest {
	public static void main(String[] args) {
		Jedis jedis = new Jedis();
		jedis.hsetnx("hash", "k1", "v1");
		System.out.println(jedis.hget("hash", "k1"));
		jedis.hdel("hash", "k1");
		System.out.println(jedis.hget("hash", "k1"));
	}
}
