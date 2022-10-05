package arraysDemo;

public class Main {

	public static void main(String[] args) {
		String ogrenci1="Burak";
		String ogrenci2="Buket";
		String ogrenci3="Deniz";
		
		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		
		System.out.println("---------------------------");
		
		String[] ogrenciler = new String[3];
		ogrenciler[0]="Burak";
		ogrenciler[1]="Buket";
		ogrenciler[2]="Deniz";
		
		for(int i=0; i<ogrenciler.length;i++) {
				System.out.println(ogrenciler[i]);
	}
	}

}


