package list;

import java.util.List;

import redis.clients.jedis.Jedis;

public class LremTest {
	public static void main(String[] args) {
		Jedis jedis = new Jedis();
		jedis.rpush("list", "a","b","a","c","a","d");
		List<String> list = jedis.lrange("list", 1, 3);
		for(String str:list) {
			System.out.println(str);
		}
	}
}
