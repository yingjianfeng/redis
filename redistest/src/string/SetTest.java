package string;

import java.util.Set;

import redis.clients.jedis.Jedis;

public class SetTest {

	public static void main(String[] args) {
		//连接本地redis
		Jedis jedis = new Jedis();
		jedis.set("k1", "v1");
		jedis.set("k2", "v2");
		jedis.set("k3", "v3");
		Set<String> String = jedis.keys("*");
		for(String s:String) {
			System.out.println(jedis.get(s));
		}
	}
}
