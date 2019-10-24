package zset;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.Tuple;

public class ZremrangebyrankTest {
	public static void main(String[] args) {
		Jedis jedis = new Jedis();
//		Map map = new HashMap();
//		map.put("a", 77.0);
//		map.put("s", 45.0);
//		map.put("d", 67.0);
//		map.put("f", 33.0);
//		map.put("g", 90.0);
//		jedis.zadd("zset", map);
		Set<Tuple> set = jedis.zrangeWithScores("zset", 0, -1);
		for(Tuple t:set) {
			System.out.println(t.getScore()+" "+t.getElement());
		}
		
		System.out.println(" ");
		jedis.zremrangeByRank("zset", 1, 3);
		Set<Tuple> set2 = jedis.zrangeWithScores("zset", 0, -1);
		for(Tuple t:set2) {
			System.out.println(t.getScore()+" "+t.getElement());
		}
	}
}
