package zset;

import java.util.HashMap;
import java.util.Map;

import redis.clients.jedis.Jedis;

public class ZaddTest {
	public static void main(String[] args) {
		Jedis jedis = new Jedis();
		Map map = new HashMap();
		map.put("a", 1.0);
		map.put("b", 2.0);
		map.put("c", 3.0);
		jedis.zadd("zset", map);
	}
}
