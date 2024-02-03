package Collection.Map;
import java.util.Map;
import java.util.LinkedHashMap;
class LRUCache<K, V> extends LinkedHashMap<K, V> {
    private final int capacity; // 缓存的容量

    public LRUCache(int capacity) {
        // true 表示让 LinkedHashMap 按访问顺序排序
        super(capacity, 0.75f, true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        // 当 map 中的数据量大于指定的缓存容量时，移除最老的元素
        return size() > capacity;
    }
}

public class LinkedHashMapExample {

    public static void main(String[] args) {
        LRUCache<Integer, String> cache = new LRUCache<>(2);

        cache.put(1, "Apple");
        cache.put(2, "Banana");
        System.out.println(cache.keySet()); // 输出：[1, 2]

        cache.get(1); // 访问键为 1 的元素
        cache.put(3, "Cherry"); // 添加新元素，此时容量超出，会移除键为 2 的元素
        System.out.println(cache.keySet()); // 输出：[1, 3]

        cache.put(4, "Date"); // 继续添加新元素，移除键为 1 的元素
        System.out.println(cache.keySet()); // 输出：[3, 4]
    }
}
