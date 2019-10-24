package hash;

import java.util.List;

import redis.clients.jedis.Jedis;

public class HmgetTest {
	public static void main(String[] args) {
		Jedis jedis = new Jedis();
		List<String> list = jedis.hmget("hash", "k1", "k3");
		for (String str : list) {
			System.out.println(str);
		}
	}
}
