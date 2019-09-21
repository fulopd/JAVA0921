
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int szam = 3499;
		int szamlalo = 0;
		System.out.println("A vizsgált szám: " + szam);
		for (int i = 1; i <= szam; i++) {
			
			if (szam % i == 0) {
				szamlalo++;
				System.out.println("A szám osztói:" + i);
			}
		}
		
		if (szamlalo == 2) {
			System.out.println("Prím szám ");
		}else {
			System.out.println("Nem pírm");
		}
		
	}

}
