package zset;

import java.util.Set;

import redis.clients.jedis.Jedis;

public class ZremTest {
	public static void main(String[] args) {
		Jedis jedis = new Jedis();
		Set<String> set1 = jedis.zrange("zset", 0, -1);
		for(String str:set1) {
			System.out.print(str+" ");
		}
		System.out.println();
		jedis.zrem("zset", "a");
		Set<String> set2 = jedis.zrange("zset", 0, -1);
		for(String str:set2) {
			System.out.print(str+" ");
		}
	}
}
