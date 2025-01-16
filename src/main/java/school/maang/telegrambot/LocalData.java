package school.maang.telegrambot;

import java.util.ArrayList;

public class LocalData {

    private static final ArrayList<Products> products = new ArrayList();

    public static ArrayList<Products> loadProducts() {
        products.clear();

        Products p = new Products(0, "Lavash", "Bu mazali lavash", "lavash", 0.5f, 20.0);
        Products p1 = new Products(1, "Burger", "Bu mazali lavash", "burger", 0.5f, 20.0);
        Products p2 = new Products(2, "Hotdog", "Bu mazali lavash", "hotdog", 0.5f, 20.0);
        Products p3 = new Products(3, "Danar", "Bu mazali lavash", "danar", 0.5f, 20.0);

        products.add(p);
        products.add(p1);
        products.add(p2);
        products.add(p3);

        return products;
    }

    public static Products getProductWithName(String name) {
        for (Products p : products) {
            if (p.getName().equalsIgnoreCase(name)) {
                return p;
            }
        }
        throw new IllegalArgumentException("Bu aydidagi ovqat topilmaid");
    }

}
