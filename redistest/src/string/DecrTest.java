package string;

import redis.clients.jedis.Jedis;

public class DecrTest {
	public static void main(String[] args) {
		Jedis jedis = new Jedis();
		System.out.println(jedis.get("k1"));
		jedis.decr("k1");
		System.out.println(jedis.get("k1")); //��1�ı���������
	}
}
