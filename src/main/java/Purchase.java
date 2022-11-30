import java.util.HashMap;
import java.util.Map;

public class Purchase {
    protected Map<String, Integer> basket = new HashMap<>();
    protected HashMap<String, Integer> products;

    public Purchase(HashMap<String, Integer> products) {
        this.products = products;
    }

    public void addPurchase(String title, int count) {
        if (basket.get(title) == null) {
            basket.put(title, count);
        } else {
            int sum = basket.get(title) + count;
            basket.put(title, sum);
        }
    }

    public void shop() {
        System.out.println("В МАГАЗИНЕ В НАЛИЧИИ");
        for (Map.Entry<String, Integer> productAndPrice : products.entrySet()) {
            System.out.println(productAndPrice.getKey() + " за " + productAndPrice.getValue() + " руб./шт.");
        }
    }


    public void sum() {
        System.out.println("ИТОГО КОРЗИНА:");
        for (Map.Entry<String, Integer> productAndPrice : products.entrySet()) {
            if (basket.get(productAndPrice.getKey()) != null) {
                System.out.println("\t" + productAndPrice.getKey() + " " + productAndPrice.getValue() + " шт. в сумме " + (basket.get(productAndPrice.getKey()) * productAndPrice.getValue()) + " руб.");
            }
        }
    }
}