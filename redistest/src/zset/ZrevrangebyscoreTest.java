package zset;

import java.util.Set;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.Tuple;

public class ZrevrangebyscoreTest {
	public static void main(String[] args) {
		Jedis jedis = new Jedis();
		Set<Tuple> set = jedis.zrevrangeByScoreWithScores("zset",0,3);
		for(Tuple t:set) {
			System.out.println(t.getScore()+" "+t.getElement());
		}
	}
}
