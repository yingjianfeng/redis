package string;

import redis.clients.jedis.Jedis;

public class GetTest {
	public static void main(String[] args) {
		Jedis jedis = new Jedis();
		jedis.set("k1", "v1");
		jedis.set("k2", "v2");
		jedis.set("k3", "v3");
		String k1 = jedis.get("k1");
		String k2 = jedis.get("k2");
		String k3 = jedis.get("k3");
		System.out.println(k1);
		System.out.println(k2);
		System.out.println(k3);
		
	}
}
