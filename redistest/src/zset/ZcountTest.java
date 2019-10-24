package zset;

import java.util.Set;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.Tuple;

public class ZcountTest {
	public static void main(String[] args) {
		Jedis jedis = new Jedis();
		Set<Tuple> set = jedis.zrangeWithScores("zset", 0, -1);
		for(Tuple t:set) {
			System.out.println(t.getScore()+" "+t.getElement());
		}
		Long len = jedis.zcount("zset", 0, 3);
		System.out.println(len);
	}
}
