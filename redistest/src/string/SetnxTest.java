package string;

import redis.clients.jedis.Jedis;

public class SetnxTest {
	public static void main(String[] args) {
		Jedis jedis = new Jedis();
		Boolean isexist = jedis.exists("test");
		//false ������  true ����
		System.out.println("isexist: " + isexist);
		Long res1 = jedis.setnx("k1", "v1");
		Long res2 = jedis.setnx("k1", "v2");
		System.out.println("res1: " + res1);
		// 1 �ɹ�
		System.out.println("res2: " + res2);
		// 0 ʧ��
	}
}
