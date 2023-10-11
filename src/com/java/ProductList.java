package com.java;

import java.util.List;

public class ProductList extends Product {
    public ProductList(String name, double price, String category, String grade) {
		super(name, price, category, grade);
	}

	public static void main(String[] args) {
        // Creating a list of Product objects
        List<Product> products = List.of(
            new Product("Product1", 1000, "Electronics", "A"),
            new Product("Product2", 5000, "Clothing", "B"),
            new Product("Product3", 7500, "Home Decor", "A")
        );

        // Using a lambda expression to implement the CostCalculator functional interface
        CostCalculator calculator = productList -> productList.stream()
                .mapToDouble(Product::getPrice)
                .sum();

        // Calculating the total cost of all products
        double totalCost = calculator.calculateCost(products);

        System.out.printf("Total cost of all products: $%.2f%n", totalCost);
    }
}
