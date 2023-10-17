package com.java;

import java.util.ArrayList;
import java.util.List;

class Changing_Name {
    private String name;
    private double price;
    private String category;
    private String grade;

    public Changing_Name(String name, double price, String category, String grade) {
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

 class Changing_Name_In_Capital {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Product1", 1200, "Electronics", "A+"));
        products.add(new Product("Product2", 800, "Clothing", "B"));
        products.add(new Product("Product3", 1500, "Electronics", "A"));
        products.add(new Product("Product4", 900, "Home Decor", "C"));
        products.add(new Product("Product5", 1100, "Electronics", "B+"));

        List<String> filteredNames = products.stream()
                .filter(product -> product.getPrice() > 1000 && product.getCategory().equals("Electronics"))
                .map(product -> product.getName().toUpperCase())
                .toList();

        for (String name : filteredNames) {
            System.out.println(name);
        }
    }
}
