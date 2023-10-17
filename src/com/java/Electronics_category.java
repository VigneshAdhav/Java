package com.java;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Electronics_category {
    private String name;
    private double price;
    private String category;
    private String grade;

    public Electronics_category(String name, double price, String category, String grade) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public String getGrade() {
        return grade;
    }
}

 class Electronic {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Product1", 1200, "Electronics", "A+"));
        products.add(new Product("Product2", 800, "Clothing", "B"));
        products.add(new Product("Product3", 1500, "Electronics", "A"));
        products.add(new Product("Product4", 900, "Home Decor", "C"));
        products.add(new Product("Product5", 1100, "Electronics", "B+"));

        List<Product> electronicsProducts = products.stream()
                .filter(product -> product.getCategory().equals("Electronics"))
                .collect(Collectors.toList());

        for (Product Electronics_category : electronicsProducts) {
            System.out.println("Name: " + Electronics_category.getName() +
                    ", Price: " + Electronics_category.getPrice() +
                    ", Category: " + Electronics_category.getCategory() +
                    ", Grade: " + Electronics_category.getGrade());
        }
    }
}
