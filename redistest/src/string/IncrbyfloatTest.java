package string;

import redis.clients.jedis.Jedis;

public class IncrbyfloatTest {
	public static void main(String[] args) {
		Jedis jedis = new Jedis();
		System.out.println(jedis.get("k1"));
		jedis.incrByFloat("k1", 0.5);
		System.out.println(jedis.get("k1"));
	}
}
