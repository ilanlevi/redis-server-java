package entities;

import constValues.EntitiesDefault;
import org.redisson.api.RMap;
import org.redisson.api.RedissonClient;

public class AbstractMapCollection<K, V extends BaseObject> {
    protected CollectionStoreKey collectionStoreKey;
    protected RMap<K, ObjectWrap<V>> entities;
    protected RedissonClient redissonClient;

    public AbstractMapCollection(CollectionStoreKey collectionStoreKey, RedissonClient redissonClient) {
        this.collectionStoreKey = collectionStoreKey;
        this.redissonClient = redissonClient;
    }

    public AbstractMapCollection( RedissonClient redissonClient) {
        this(new CollectionStoreKey(EntitiesDefault.DEFAULT_COLLEACTION_NAME, EntitiesDefault.DEFAULT_PARTITION_NAME), redissonClient);
    }

    public CollectionStoreKey getCollectionStoreKey() {
        return collectionStoreKey;
    }

    public RMap<K, ObjectWrap<V>> getEntities() {
        return entities;
    }

    public RedissonClient getRedissonClient() {
        return redissonClient;
    }

}
