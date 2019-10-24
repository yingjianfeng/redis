package string;

import redis.clients.jedis.Jedis;

public class StrlenTest {
	public static void main(String[] args) {
		Jedis jedis = new Jedis();
		String res = jedis.set("k1","helloworld");
		Long len = jedis.strlen("k1");
		System.out.println(res);
		System.out.println(len);
	}
}
