package list;

import java.util.List;

import redis.clients.jedis.Jedis;

public class LrangeTest {
	public static void main(String[] args) {
		Jedis jedis = new Jedis();
		List<String> list = jedis.lrange("list", 0, -1);
		for(String str:list) {
			System.out.print(str+" ");
		}
	}
}
