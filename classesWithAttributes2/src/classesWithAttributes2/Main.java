package classesWithAttributes2;

import classesWithAttributes2.Product;
import classesWithAttributes2.ProductManager;

public class Main {

	public static void main(String[] args) {
	
			// Product product = new Product( 1, "Laptop", "Asus Laptop", 5000, 2, "siyah" );
			Product product = new Product(1, "Laptop", "Asus Laptop", 3000, 2, "siyah");
			// product.setId(1);
			// product.setName("Laptop");
		    // product.setDescription("Asus Laptop");
			// product.setPrice (10000);
			// product.setStockAmount (5);
			 
			 
			 ProductManager productManager = new ProductManager();
			 productManager.Add(product);
			 
			 

		}


}
