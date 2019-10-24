package string;

import redis.clients.jedis.Jedis;

public class IncrbyTest {
	public static void main(String[] args) {
		Jedis jedis = new Jedis();
		jedis.set("k1","20");
		String k1 = jedis.get("k1");
		System.out.println(k1);
		jedis.incrBy("k1", 20);
		String k2 = jedis.get("k1");
		System.out.println(k2);
	}
}
