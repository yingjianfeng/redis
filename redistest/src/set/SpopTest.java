package set;

import java.util.Set;

import redis.clients.jedis.Jedis;

public class SpopTest {
	public static void main(String[] args) {
		Jedis jedis = new Jedis();
		Set<String> set = jedis.smembers("set");
		for(String str:set) {
			System.out.print(str+" ");
		}
		System.out.println("");
		String spop = jedis.spop("set");
		System.out.println(spop);
		Set<String> set2 = jedis.smembers("set");
		for(String str:set2) {
			System.out.print(str+" ");
		}
	}
}
