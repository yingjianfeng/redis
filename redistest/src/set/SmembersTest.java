package set;

import java.util.Set;

import redis.clients.jedis.Jedis;

public class SmembersTest {
	public static void main(String[] args) {
		Jedis jedis = new Jedis();
		Set<String> set = jedis.smembers("set");
		for (String str : set) {
			System.out.print(str+" ");
		}
	}
}
