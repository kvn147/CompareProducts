/*
 * Kevin Nguyen
 * 04/10/2024
 * Product.java uses an ArrayList with Products given names and prices.
 * We compare a Product with another Product and the program will return -1
 * if the product is less than the other, and 1 if it is greater, or 0 if it is equal.
 */

public class Product implements Comparable<Product> {

    private String name;

    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    // Return name and price values of a Product
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    // Return < 0, if product is less than other. Return > 0, if product is greater than other.
    // Otherwise, return 0.
    public int compareTo(Product other) {
        if (price < other.price) {
            return -1;
        } else if (price > other.price) {
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        Product one = new Product("Apples", 3.49);
        Product two = new Product("Oranges", 5.15);

        int result = one.compareTo(two);
    }
}
