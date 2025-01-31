package sample_problems_for_hash_maps_and_hash_functions.implement_a_custom_hash_map;

public class Entry<K, V> {
    K key;
    V value;
    Entry<K, V> next;

    public Entry(K key, V value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }
}
