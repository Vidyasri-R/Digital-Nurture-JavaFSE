import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Double> items;
    public ShoppingCart() {
        items = new ArrayList<>();
    }
    public void addItem(double price) {
        items.add(price);
    }
    public void removeItem(double price) {
        items.remove(price);
    }
    public double getTotal() {
        double total = 0;
        for (double price : items) {
            total += price;
        }
        return total;
    }
    public int getItemCount() {
        return items.size();
    }
    public void clear() {
        items.clear();
    }
}
