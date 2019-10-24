package string;

import java.util.List;

import redis.clients.jedis.Jedis;

public class MgetTest {
	public static void main(String[] args) {
		Jedis jedis = new Jedis();
		List<String> res = jedis.mget("k1", "k2");
		for (String str : res) {
			System.out.println(str);
		}
	}
}
