package Collection.Map;

import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapExample {

    public static void main(String[] args) {

        // NavigableMap 的使用
        NavigableMap<Double, String> priceToProductMap = new TreeMap<>();

        // 添加商品及其價格
        priceToProductMap.put(19.99, "T-Shirt");
        priceToProductMap.put(99.99, "Sneakers");
        priceToProductMap.put(5.99, "Cup");

        // 找到價格最接近但不超過 20 的商品
        Map.Entry<Double, String> entry = priceToProductMap.floorEntry(20.00);
        System.out.println("Product with price closest to 20: " + entry);

        // sorted map 的使用
        SortedMap<Integer, String> customerData = new TreeMap<>();

        // 添加客戶數據
        customerData.put(1003, "Alice");
        customerData.put(1002, "Bob");
        customerData.put(1001, "Charlie");
        customerData.put(1004, "Diana");

        // 獲取特定範圍內的客戶賬戶
        SortedMap<Integer, String> subCustomerData = customerData.subMap(1002, 1004);
        System.out.println("Sub customer data: " + subCustomerData);
    }
}
