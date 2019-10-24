package list;

import redis.clients.jedis.Jedis;

public class RpushxTest {
	public static void main(String[] args) {
		Jedis jedis = new Jedis();
		Long rpush = jedis.rpushx("s", "dd");
		System.out.println(rpush);
	}
}
