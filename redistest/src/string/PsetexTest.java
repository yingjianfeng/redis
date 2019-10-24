package string;

import redis.clients.jedis.Jedis;

public class PsetexTest {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Jedis jedis = new Jedis();
		String res = jedis.psetex("k1", 30000, "v1");
		System.out.println(res);
	}
}
