package hash;

import java.util.Set;

import redis.clients.jedis.Jedis;

public class HkeysTest {
	public static void main(String[] args) {
		Jedis jedis = new Jedis();
		Set<String> set = jedis.hkeys("hash");
		for (String str : set) {
			System.out.println(str);
		}
	}
}
