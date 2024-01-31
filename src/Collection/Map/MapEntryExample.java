package Collection.Map;

import java.util.HashMap;
import java.util.Map;

public class MapEntryExample {
    public static void main(String[] args) {
        // 創建 HashMap 並添加一些元素
        Map<String, Integer> fruitPrices = new HashMap<>();
        fruitPrices.put("Apple", 40);
        fruitPrices.put("Banana", 10);
        fruitPrices.put("Cherry", 30);

        // 遍歷 Map 並打印鍵值對
        for (Map.Entry<String, Integer> entry : fruitPrices.entrySet()) {
            System.out.println("原始: " + entry.getKey() + " => " + entry.getValue());
        }

        // 修改某些值
        for (Map.Entry<String, Integer> entry : fruitPrices.entrySet()) {
            if ("Banana".equals(entry.getKey())) {
                entry.setValue(15); // 更新 Banana 的價格
            }
        }

        // 再次遍歷 Map 並打印更新後的鍵值對
        System.out.println("更新後:");
        for (Map.Entry<String, Integer> entry : fruitPrices.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}
