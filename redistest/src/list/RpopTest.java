package list;

import java.util.List;

import redis.clients.jedis.Jedis;

public class RpopTest {
	public static void main(String[] args) {
		Jedis jedis = new Jedis();
		List<String> list = jedis.lrange("list", 0, -1);
		for(String str: list) {
			System.out.print(str+" ");
		}
		System.out.println("");
		String s = jedis.rpop("list");
		System.out.println(s);
	}
}
