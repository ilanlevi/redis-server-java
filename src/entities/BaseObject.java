package entities;

public class BaseObject<K> {
    protected K key;

    public BaseObject(K key) {
        this.key = key;
    }

    public K getKey() {
        return key;
    }

    public BaseObject<K> setKey(K key) {
        this.key = key;
        return this;
    }
}
