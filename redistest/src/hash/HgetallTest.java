package hash;

import java.util.Map;
import java.util.Map.Entry;

import redis.clients.jedis.Jedis;

public class HgetallTest {
	public static void main(String[] args) {
		Jedis jedis = new Jedis();
		Map<String, String> map = jedis.hgetAll("hash");
		for(Entry es:map.entrySet()) {
			System.out.println(es.getKey()+": "+es.getValue());
		}
	}
}
