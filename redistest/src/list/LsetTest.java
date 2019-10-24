package list;

import java.util.List;

import redis.clients.jedis.Jedis;

public class LsetTest {
	public static void main(String[] args) {
		Jedis jedis = new Jedis();
		jedis.rpush("list", "a","b","c","d");
		List<String> list = jedis.lrange("list", 0, -1);
		for(String str:list) {
			System.out.print(str);
		}
		System.out.println("");
		jedis.lset("list", 1, "xx");
		List<String> list2 = jedis.lrange("list", 0, -1);
		for(String str:list2) {
			System.out.print(str);
		}
	}
}
