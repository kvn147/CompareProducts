import java.util.*;

/*
 * Kevin Nguyen
 * 04/10/2024
 * ProductTester.java uses an ArrayList with Products given names and prices.
 * Sort our Products and print the Products with their names and prices in increasing
 * order of price.
 */

public class ProductTester {

    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();

        products.add(new Product("Apples", 2.59));
        products.add(new Product("Oranges", 4.59));
        products.add(new Product("Gum", 3.59));

        // Will change the ordering of the products arraylist
        sortList(products);

        System.out.println(products);
    }

    // TODO Part 2, method sorts list
    public static void sortList(ArrayList<Product> products) {
        Collections.sort(products);
    }
}
