package list;

import redis.clients.jedis.Jedis;

public class LlenTest {
	public static void main(String[] args) {
		Jedis jedis = new Jedis();
		Long llen = jedis.llen("list");
		System.out.println(llen);
	}
}
