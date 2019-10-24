package zset;

import redis.clients.jedis.Jedis;

public class ZincrbyTest {
	public static void main(String[] args) {
		Jedis jedis = new Jedis();
		Double zscore = jedis.zscore("zset", "a");
		System.out.println(zscore);
		Double a = jedis.zincrby("zset", 100, "a");
		System.out.println(a);
		Double z = jedis.zscore("zset", "a");
		System.out.println(z);
	}
}
