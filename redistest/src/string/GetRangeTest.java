package string;

import redis.clients.jedis.Jedis;

public class GetRangeTest {
	public static void main(String[] args) {
		Jedis jedis = new Jedis();
		jedis.set("k1","hello world");
		String k1 = jedis.get("k1");
		System.out.println(k1);
		String res = jedis.getrange("k1", 1, 5);
		System.out.println(res);
	}
}
