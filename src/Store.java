import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Store {
    private Map<Integer, Product> products;

    public Store() {
        products = new HashMap<>();
    }

    public void addProduct(Product product) {
        products.put(product.getId(), product);
    }

    public void displayProducts() {
        System.out.println("Products in the store:");
        for (Product product : products.values()) {
            System.out.println(product);
        }
    }

    public void displayProductById(int id) {
        if (products.containsKey(id)) {
            System.out.println("Product with id " + id + ":");
            System.out.println(products.get(id));
        } else {
            System.out.println("Product with id " + id + " does not exist in the store.");
        }
    }

    public static void main(String[] args) {
        Store store = new Store();
        store.addProduct(new Product(123, "Milk", 10, 2.3));
        store.addProduct(new Product(212, "Bread", 20, 1.2));
        store.addProduct(new Product(342, "Eggs", 30, 4.7));
        store.addProduct(new Product(414, "Cheese", 15, 3.5));

        store.displayProducts();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the id of the product you want to display: ");
        int id = scanner.nextInt();
        store.displayProductById(id);
    }
}

