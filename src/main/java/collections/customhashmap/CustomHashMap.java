package collections.customhashmap;

import java.util.LinkedList;

public class CustomHashMap<K, V> {
    private static final int DEFAULT_CAPACITY = 16;
    private LinkedList<Entry<K, V>>[] buckets;
    private int size;

    public CustomHashMap() {
        this(DEFAULT_CAPACITY);
    }

    public CustomHashMap(int initialCapacity) {
        buckets = new LinkedList[initialCapacity];
        for (int i = 0; i < initialCapacity; i++) {
            buckets[i] = new LinkedList<>();
        }
        size = 0;
    }

    public void put(K key, V value) {
        if (key == null) {
            putNullKey(value);
            return;
        }

        int index = getIndex(key);
        LinkedList<Entry<K, V>> bucket = buckets[index];

        for (Entry<K, V> entry : bucket) {
            if (entry.key.equals(key)) {
                entry.value = value;
                return;
            }
        }

        bucket.add(new Entry<>(key, value));
        size++;
    }

    public V get(K key) {
        if (key == null) {
            return getNullKey();
        }

        int index = getIndex(key);
        LinkedList<Entry<K, V>> bucket = buckets[index];

        for (Entry<K, V> entry : bucket) {
            if (entry.key.equals(key)) {
                return entry.value;
            }
        }

        return null; // Key not found
    }

    public void remove(K key) {
        if (key == null) {
            removeNullKey();
            return;
        }

        int index = getIndex(key);
        LinkedList<Entry<K, V>> bucket = buckets[index];

        for (Entry<K, V> entry : bucket) {
            if (entry.key.equals(key)) {
                bucket.remove(entry);
                size--;
                return;
            }
        }
    }

    public int size() {
        return size;
    }

    private int getIndex(K key) {
        int hashCode = key.hashCode();
        return hashCode % buckets.length;
    }

    private void putNullKey(V value) {
        int index = 0; // Use index 0 for null key
        LinkedList<Entry<K, V>> bucket = buckets[index];

        for (Entry<K, V> entry : bucket) {
            if (entry.key == null) {
                entry.value = value;
                return;
            }
        }

        bucket.add(new Entry<>(null, value));
        size++;
    }

    private V getNullKey() {
        int index = 0; // Use index 0 for null key
        LinkedList<Entry<K, V>> bucket = buckets[index];

        for (Entry<K, V> entry : bucket) {
            if (entry.key == null) {
                return entry.value;
            }
        }

        return null; // Key not found
    }

    private void removeNullKey() {
        int index = 0; // Use index 0 for null key
        LinkedList<Entry<K, V>> bucket = buckets[index];

        for (Entry<K, V> entry : bucket) {
            if (entry.key == null) {
                bucket.remove(entry);
                size--;
                return;
            }
        }
    }

    private static class Entry<K, V> {
        K key;
        V value;

        Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
}