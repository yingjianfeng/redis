package set;

import java.util.Set;

import redis.clients.jedis.Jedis;

public class SremTest {
	public static void main(String[] args) {
		Jedis jedis = new Jedis();
		Set<String> set = jedis.smembers("set");
		for(String str:set) {
			System.out.print(str+" ");
		}
		System.out.println();
		Long res = jedis.srem("set", "a","c","6");
		System.out.println(res);
		Set<String> set2 = jedis.smembers("set");
		for(String str:set2) {
			System.out.print(str+" ");
		}
	}
}
