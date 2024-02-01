package Collection.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Order {
    String category;
    double price;

    public Order(String category, double price) {
        this.category = category;
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }
}

/**
 * 假設我們有一個訂單列表，每個訂單包含價格和類別，我們想要計算每個類別的總銷售額。
 * output {Toys=50.0, Clothing=75.0, Electronics=350.0}
 */
class Main {
    public static void main(String[] args) {
        List<Order> orders = Arrays.asList(
                new Order("Electronics", 200.0),
                new Order("Clothing", 75.0),
                new Order("Electronics", 150.0),
                new Order("Toys", 50.0)
        );

        Map<String, Double> totalSalesByCategory = orders.stream()
                .collect(Collectors.groupingBy(Order::getCategory,
                        Collectors.summingDouble(Order::getPrice)));
        System.out.println(totalSalesByCategory);
    }
}

