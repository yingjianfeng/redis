package string;

import redis.clients.jedis.Jedis;

public class DecrbyTest {
	public static void main(String[] args) {
		Jedis jedis = new Jedis();
		System.out.println(jedis.get("k1"));
		jedis.decrBy("k1", 10);
		System.out.println(jedis.get("k1"));
	}
}
