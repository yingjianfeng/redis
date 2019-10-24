package hash;

import java.util.HashMap;
import java.util.Map;

import redis.clients.jedis.Jedis;

public class HmsetTest {
	public static void main(String[] args) {
		Jedis jedis = new Jedis();
		Map map = new HashMap();
		map.put("k1", "v1");
		map.put("k2", "v2");
		map.put("k3", "v3");
		jedis.hmset("hash", map);
		System.out.println(jedis.hgetAll("hash"));
	}
}
