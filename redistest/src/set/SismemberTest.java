package set;

import java.util.Set;

import redis.clients.jedis.Jedis;

public class SismemberTest {
	public static void main(String[] args) {
		Jedis jedis = new Jedis();
		Set<String> set = jedis.smembers("set");
		for(String str:set) {
			System.out.print(str+" ");
		}
		System.out.println(" ");
		Boolean c = jedis.sismember("set", "c");
		Boolean x = jedis.sismember("set", "x");
		System.out.println(c);
		System.out.println(x);
	}
}
