package list;

import java.util.List;

import redis.clients.jedis.Jedis;

public class LtrimTest {
	public static void main(String[] args) {
		Jedis jedis = new Jedis();
		List<String> list = jedis.lrange("list", 0, -1);
		for(String str:list) {
			System.out.print(str+" ");
		}
		System.out.println("");
		String res = jedis.ltrim("list", 1, 3);
		System.out.println(res);
		List<String> list2 = jedis.lrange("list", 0, -1);
		for(String str:list2) {
			System.out.print(str+" ");
		}
	}
}
