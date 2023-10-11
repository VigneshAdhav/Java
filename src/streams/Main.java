package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main{
	public static void main(String[] args) {
		
		
		  // Create a list of products
        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 1200.0, "Electronics", 5));
        products.add(new Product("TV", 800.0, "Electronics", 4));
        products.add(new Product("Shirt", 25.0, "Fashion", 3));
        products.add(new Product("Phone", 1500.0, "Electronics", 5));
        
        
        //Get all products with a price greater than 1000:
		List<Product> electronicsProducts = products.stream()
			    .filter(product -> product.getCategory().equalsIgnoreCase("electronics"))
			    .collect(Collectors.toList());
		System.out.println(electronicsProducts);

		
	}
}
	