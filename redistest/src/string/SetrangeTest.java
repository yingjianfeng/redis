package string;

import redis.clients.jedis.Jedis;

public class SetrangeTest {
	public static void main(String[] args) {
		Jedis jedis = new Jedis();
		String k1 = jedis.set("k1","hello world");
		System.out.println(k1);
		Long len = jedis.setrange("k1", 1, "ok");
		System.out.println(len);
	}
}
