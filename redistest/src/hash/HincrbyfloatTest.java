package hash;

import redis.clients.jedis.Jedis;

public class HincrbyfloatTest {
	public static void main(String[] args) {
		Jedis jedis = new Jedis();
		jedis.hset("hash", "k1", "1");
		jedis.hset("hash", "k2", "2");
		jedis.hset("hash", "k3", "3");
		jedis.hincrByFloat("hash", "k1", 0.1);
		jedis.hincrByFloat("hash", "k2", 0.1);
		jedis.hincrByFloat("hash", "k3", 0.1);
		System.out.println(jedis.hgetAll("hash"));
	}
}
