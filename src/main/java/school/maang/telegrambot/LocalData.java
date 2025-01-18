package school.maang.telegrambot;

import lombok.Data;

import java.util.ArrayList;

public class LocalData {

    private static final ArrayList<Product> product = new ArrayList();


    public static ArrayList<Product> loadProduct() {

Product p = new Product();
        product.add(p);

        return product;


    }
}
