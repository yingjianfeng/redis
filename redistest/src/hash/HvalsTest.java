package hash;

import java.util.List;

import redis.clients.jedis.Jedis;

public class HvalsTest {
	public static void main(String[] args) {
		Jedis jedis = new Jedis();
		List<String> list = jedis.hvals("hash");
		for (String str : list) {
			System.out.println(str);
		}
	}
}
