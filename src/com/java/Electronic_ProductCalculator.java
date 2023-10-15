package com.java;

import java.util.ArrayList;
import java.util.List;

public class Electronic_ProductCalculator extends Electronic_Product {
    public static double calculateElectronicCost(List<Product> products) {
        double electronicCost = 0.0;
        
        for (Product Electronic_Product : products) {
            if ("electronic".equalsIgnoreCase(Electronic_Product.getCategory())) {
                electronicCost += Electronic_Product.getPrice();
            }
        }
        
        return electronicCost;
    }

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Electronic_Product("Laptop", 800.0, "electronic", 5));
        products.add(new Electronic_Product("Headphones", 50.0, "electronic", 4));
        products.add(new Electronic_Product("Shoes", 60.0, "clothing", 3));
        products.add(new Electronic_Product("Phone", 400.0, "electronic", 5));

        double electronicCost = calculateElectronicCost(products);
        System.out.println("Total cost of electronic products: $" + electronicCost);
    }
}
