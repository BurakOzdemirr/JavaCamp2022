package staticDemo;

public class Main {

	public static void main(String[] args) {
		ProductManager manager = new ProductManager();
		Product product= new Product();
		product.price= 10;
		product.name = "Mouse";
		
		manager.add(product);
		
		
		

	}

}


// static dediğimiz yapı şu anlama geliyor. 
//Örneğin biz main'i başka bir yerden çağırmaya çalışırsak.
// ve orada buradaki main operasyonunu çağırmaya çalışırsak.
// hiçbir şekilde bunu new'leyerek buna ulaşamayız.
// onun yerine main.main diye ulaşabiliriz.