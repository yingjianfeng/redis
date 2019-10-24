package string;

import redis.clients.jedis.Jedis;

public class AppendTest {
	public static void main(String[] args) {
		Jedis jedis = new Jedis();
		String k1 = jedis.get("k1");
		System.out.println(k1);
		Long res = jedis.append("k1", "123");
		System.out.println(res);
	}
}
