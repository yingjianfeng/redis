package hash;

import redis.clients.jedis.Jedis;

public class HgetTest {
	public static void main(String[] args) {
		Jedis jedis = new Jedis();
		String res = jedis.hget("hash", "k1");
		System.out.println(res);
	}
}
