package metotOverloading2;

public class Main {

	public static void main(String[] args) {
//Biz classlarımızı içerisinde ortak operasyonları veya alanları tutmak için oluşturuyoruz.
		
		DortIslem dortIslem= new DortIslem();
		System.out.println(dortIslem.topla(2, 3));
		dortIslem.topla(2, 3, 5);
	}

}
