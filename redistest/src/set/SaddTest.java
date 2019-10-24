package set;

import redis.clients.jedis.Jedis;

public class SaddTest {
	public static void main(String[] args) {
		Jedis jedis = new Jedis();
		Long sadd = jedis.sadd("set", "a","b","a","c","d","b");
		System.out.println(sadd);
	}
}
