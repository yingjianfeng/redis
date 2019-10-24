package list;

import redis.clients.jedis.Jedis;

public class RpushTest {
	public static void main(String[] args) {
		Jedis jedis = new Jedis();
		jedis.rpush("list", "a","b","c");
	}
}
