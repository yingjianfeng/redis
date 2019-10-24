package string;

import redis.clients.jedis.Jedis;

public class IncrTest {
	public static void main(String[] args) {
		Jedis jedis = new Jedis();
		jedis.set("k1", "50");
		String k1 = jedis.get("k1");
		System.out.println(k1);
//		jedis.incr("k1");
//		String k2 = jedis.get("k1");
//		System.out.println(k2);
		jedis.incrBy("k1", 20);
		String k2 = jedis.get("k1");
		System.out.println(k2);
	}
}
