package list;

import redis.clients.jedis.Jedis;

public class LpushxTest {
	public static void main(String[] args) {
		Jedis jedis = new Jedis();
		jedis.lpushx("list", "a");
		jedis.lpushx("list", "b");
		Long res = jedis.lpushx("list", "c");
		System.out.println(res);
	}
}
