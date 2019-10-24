package list;

import java.util.List;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.BinaryClient.LIST_POSITION;

public class LinsertTest {
	public static void main(String[] args) {
		Jedis jedis = new Jedis();
		List<String> list = jedis.lrange("list", 0, -1);
		for (String str : list) {
			System.out.print(str+" ");
		}
		System.out.println(" ");
		jedis.linsert("list", LIST_POSITION.BEFORE, "c", "xx");
		List<String> list2 = jedis.lrange("list", 0, -1);
		for (String str : list2) {
			System.out.print(str+" ");
		}
		System.out.println(" ");
	}
}
