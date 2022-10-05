package classesWithAttributes;

public class Product {
	
	public Product(int id, String name, String description, double price, int stockAnount, String renk) {
		System.out.println("Yapıcı blok çalıştı.");
		this.id= id;
		this.renk= renk;
		this.description = description;
		this.name = name;
		this.price = price;
		this.stockAnount = stockAnount;
	}
	
	
	
	// Attribute veya Field
	private int id;
	private String name;
	private String description;
	private double price;
	private int stockAnount;
	private String renk;
	private String kod;

	// Getter 
	public int getId() {
		return id;
// bunu sadece böyle bırakırsak id yi okuyabilir demek ama yazamaz.
	}
	
	//Setter
	// set edilen değer parametre olarak verilmelidir.
	// this benim içerisinde bulunduğum class demektir. 
	
	public void setId(int id) {
		id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStockAnount() {
		return stockAnount;
	}

	public void setStockAnount(int stockAnount) {
		this.stockAnount = stockAnount;
	}

	public String getRenk() {
		return renk;
	}

	public void setRenk(String renk) {
		this.renk = renk;
	}

	public String getKod() {
		return kod;
	}

	public void setKod(String kod) {
		this.kod = kod;
	}
	


}
