package hash;

import redis.clients.jedis.Jedis;

public class HexistsTest {
	public static void main(String[] args) {
		Jedis jedis = new Jedis();
		Boolean res1 = jedis.hexists("hash", "k1");
		System.out.println(res1);
		Long res2 = jedis.hdel("hash", "k1");
		System.out.println(res2);
	}
}
