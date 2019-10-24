package hash;

import redis.clients.jedis.Jedis;

public class HincrbyTest {
	public static void main(String[] args) {
		Jedis jedis = new Jedis();
		jedis.hset("hash", "k1", "1");
		jedis.hset("hash", "k2", "2");
		jedis.hset("hash", "k3", "3");
		jedis.hincrBy("hash", "k1", 10);
		jedis.hincrBy("hash", "k2", 10);
		jedis.hincrBy("hash", "k3", 10);
		System.out.println(jedis.hgetAll("hash"));
	}
}
