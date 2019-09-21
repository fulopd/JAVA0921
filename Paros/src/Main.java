
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		
		
		if (a+b > c && a+c >b && b+c > a) {
			System.out.println("Szerkeszthető");
		}else {
			System.out.println("Szerkeszthető");
		}
		
		
		//4.feladat:
		//Írj programot, mely egy 1 és 1 000 000 közötti számról eldönti, hogy hány jegyű!
		int szaam = 100;
		String szam = "";
		if (a <= 1000000 && a > 0) {
			
			szam = String.valueOf(szaam);
			System.out.println("a hossza: " + szam.length());
			
		}else {
			
		}
		
				
		
		
		
	}

}
