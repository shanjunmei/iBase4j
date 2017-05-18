package org.ibase4j.core.support.cache.jedis;

import redis.clients.jedis.ShardedJedis;

/**
 * @author LiMiaoMiao
 * @version 2017年5月18日 下午20:21:19
 */
public interface Executor<K> {
	public K execute(ShardedJedis jedis);
}
