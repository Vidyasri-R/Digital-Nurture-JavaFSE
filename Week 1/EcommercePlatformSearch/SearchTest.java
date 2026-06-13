public class SearchTest {
    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(205, "Shoes", "Footwear"),
            new Product(103, "Shirt", "Clothing"),
            new Product(404, "Headphones", "Electronics"),
            new Product(302, "Watch", "Accessories")
        };
        System.out.println("--- Linear Search ---");
        Product result1 = LinearSearch.linearSearch(products, 103);
        if (result1 != null) {
            System.out.println("Found: " + result1.getProductName() + " | Category: " + result1.getCategory());
        } else {
            System.out.println("Product not found.");
        }
        Product result2 = LinearSearch.linearSearch(products, 999);
        if (result2 != null) {
            System.out.println("Found: " + result2.getProductName());
        } else {
            System.out.println("Product with ID 999 not found.");
        }
        System.out.println("\n--- Binary Search ---");
        Product result3 = BinarySearch.binarySearch(products, 404);
        if (result3 != null) {
            System.out.println("Found: " + result3.getProductName() + " | Category: " + result3.getCategory());
        } else {
            System.out.println("Product not found.");
        }
        Product result4 = BinarySearch.binarySearch(products, 999);
        if (result4 != null) {
            System.out.println("Found: " + result4.getProductName());
        } else {
            System.out.println("Product with ID 999 not found.");
        }
    }
}
