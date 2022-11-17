package loopDemo;

public class main {

	public static void main(String[] args) {
		for(int i=3;i<=300;i+=3) {
			System.out.println(i);
		}
		System.out.println("Döngü bitti.");
		
		
		int i=1;
		while(i<10) {
			System.out.println(i);
			i++;
		}
		
		
		System.out.println("While Döngüsü bitti");
		int j=1;
		do {
				System.out.println(j);
				j++;	
		} while(j<10);
		System.out.println("Do-While Döngüsü bitti");
	}

}
