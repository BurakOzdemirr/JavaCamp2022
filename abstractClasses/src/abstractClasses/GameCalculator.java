package abstractClasses;

public abstract class GameCalculator {

	public abstract void hesapla();

	
	public void gameOver() {
		System.out.println("Oyun bitti");
	}

}


//abstract demek GameCalculator'u kim kullanıyorsa gameOver'ı olduğu gibi kullanmak zorunda
// fakat hesapla ya gelince hesapla kim inherit ediyorsa hesaplayıiçermek zorunda fakat hesaplayı override etmek zorunda 
// işte böyle durumlarınız varsa şuan burada olduğu gibi

// abstract bir sınıfın abstract olabilmesi için abstract imzasıyla beslenmesi gerekiyor. 
// abstractlar sizin base'i gizlemek istediğiniz zamanlarda da kullanılır.'
// abstract sınıflar asla new'lenemez. new'lenebilmesi' için sizin onun operasyonlarını ezmeniz gerekmektedir.  Ama bu iyi bir kullanım değil. O YÜZDEN ASLA KULLANMAYIN.