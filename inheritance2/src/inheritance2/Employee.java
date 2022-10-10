package inheritance2;

public class Employee extends Person{

	
	double salary;
}

// bu iki nesne de ortak özelliklere sahip.
// bu ortak özellikleri yazmak yerine 
// yeni bir Person classı oluşturalım.
// daha sonra customer ve Employee deki ortak alanları keselim. Daha sonra Person içerisine yapıştıralım
// customer a gelip orada  public class Customer extends Person{ 
// extends person yazıyoruz.