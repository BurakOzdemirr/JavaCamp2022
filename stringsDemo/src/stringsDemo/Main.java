package stringsDemo;

public class Main {

	public static void main(String[] args) {
		String mesaj ="Bugün hava güzel";
		
		System.out.println(mesaj);
		
		System.out.println("Eleman Sayısı :"+mesaj.length());
		System.out.println("5. eleman : "+mesaj.charAt(4));
		System.out.println(mesaj.concat(" Yaşasın!"));
		System.out.println(mesaj.startsWith("B"));
		System.out.println(mesaj.endsWith("l"));
	
		System.out.println(mesaj.indexOf("av"));
	
		
		
		
		
		System.out.println(mesaj.replace( ' ', '-'));
	
	
	}

}
