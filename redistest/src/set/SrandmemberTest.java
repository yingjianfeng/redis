package set;

import java.util.List;
import java.util.Set;

import redis.clients.jedis.Jedis;

public class SrandmemberTest {
	public static void main(String[] args) {
		Jedis jedis = new Jedis();
		jedis.sadd("set", "a","b","c","d","e","f");
		Set<String> set = jedis.smembers("set");
		for(String str:set) {
			System.out.print(str+" ");
		}
		System.out.println();
//		List<String> list = jedis.srandmember("set",3);
		List<String> list = jedis.srandmember("set",-3);
		for(String str:list) {
			System.out.print(str+" ");
		}
	}
}
