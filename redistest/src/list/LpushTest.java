package list;

import redis.clients.jedis.Jedis;

public class LpushTest {
	public static void main(String[] args) {
		Jedis jedis = new Jedis();
		Long res = jedis.lpush("list","java","c++","js");
		System.out.println(res);
	}
}
