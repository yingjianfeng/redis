package hash;

import redis.clients.jedis.Jedis;

public class HstrlenTest {
	public static void main(String[] args) {
		Jedis jedis = new Jedis();
		jedis.hset("hash", "k1", "aaa");
		jedis.hset("hash", "k2", "ccccc");
		jedis.hset("hash", "k3", "ddddddd");
		//  没有这个方法
	}
}
