package zset;

import java.util.Set;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.Tuple;

public class ZscoreTest {
	public static void main(String[] args) {
		Jedis jedis = new Jedis();
		Set<Tuple> scores = jedis.zrangeWithScores("zset", 0, -1);
		for (Tuple t : scores) {
			System.out.println(t.getElement()+" "+t.getScore());
		}
	}
}
