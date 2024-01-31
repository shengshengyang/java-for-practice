package Collection.Map;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        // 創建一個 HashMap
        Map<String, Integer> map = new HashMap<>();

        // 使用 put() 方法添加鍵值對
        map.put("Apple", 40);
        map.put("Banana", 10);
        map.put("Cherry", 30);

        // 使用 get() 方法根據鍵取得值
        System.out.println("價格 of Apple: " + map.get("Apple"));

        // 使用 size() 方法獲取 Map 的大小
        System.out.println("Map 大小: " + map.size());

        // 使用 containsKey() 檢查 Map 中是否含有特定鍵
        System.out.println("是否包含 'Banana': " + map.containsKey("Banana"));

        // 使用 containsValue() 檢查 Map 中是否含有特定值
        System.out.println("是否有價格為 30 的項目: " + map.containsValue(30));

        // 使用 remove() 方法移除鍵值對
        map.remove("Cherry");
        System.out.println("After removing Cherry, Map contains: " + map);

        // 遍歷 Map
        System.out.println("-------遍歷 Map--------");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // 使用 Lambda 表達式遍歷 Map
        System.out.println("-----------遍歷 Map with Lambda-----------");
        map.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}
