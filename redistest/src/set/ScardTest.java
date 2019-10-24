package set;

import java.util.Set;

import redis.clients.jedis.Jedis;

public class ScardTest {
	public static void main(String[] args) {
		Jedis jedis = new Jedis();
		jedis.sadd("set", "a","b","c","d","e");
		Set<String> set = jedis.smembers("set");
		for(String str:set) {
			System.out.print(str+" ");
		}
		System.out.println();
		Long len = jedis.scard("set");
		System.out.println(len);
	}
}
