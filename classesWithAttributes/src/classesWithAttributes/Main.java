package classesWithAttributes;

public class Main {
// parametreli constructor 
	public static void main(String[] args) {
		 Product product = new Product( 1, "Laptop", "Asus Laptop", 5000, 2, "siyah" );
		
		// product.setId(1);
		// product.setName("Laptop");
	    // product.setDescription("Asus Laptop");
		// product.setPrice (10000);
		// product.setStockAnount (5);
		 
		 
		 ProductManager productManager = new ProductManager();
		 productManager.Add(product);
		 
		 

	}

}
