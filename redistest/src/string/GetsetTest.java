package string;

import redis.clients.jedis.Jedis;

public class GetsetTest {
	public static void main(String[] args) {
		Jedis jedis = new Jedis();
//		String res = jedis.getSet("k1", "zz");
//		System.out.println(res);
		String res2 = jedis.getSet("k1", "xx");
		System.out.println(res2);
		String res3 = jedis.get("k1");
		System.out.println(res3);
	}
}
