package arraysDemo;

public class main {

	public static void main(String[] args) {
		String ogrenci1="Engin";
		String ogrenci2="Ahmet";
		String ogrenci3="Derin";
		String ogrenci4="Fatma";
		
		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		System.out.println(ogrenci4);
		
		System.out.println("--------------------");
		
		String[] ogrenciler = new String [4];
		ogrenciler[0]="Engin";
		ogrenciler[1]="Ahmet";
		ogrenciler[2]="Derin";
		ogrenciler[3]="Salih";
		
		for (int i = 0; i < ogrenciler.length; i++) {
			System.out.println(ogrenciler[i]);
			
		}
	}

}
