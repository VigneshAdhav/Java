package com.java;

import java.util.List;

class Product {
    private String name;
    private double price;
    private String category;
    private String grade;

    public Product(String name, double price, String category, String grade) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.grade = grade;
    }

    public double getPrice() {
        return price;
    }
}

@FunctionalInterface
interface CostCalculator {
    double calculateCost(List<Product> productList);
}

