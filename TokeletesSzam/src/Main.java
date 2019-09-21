
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int szam = 6;
		int osztokOsszege=0;
		for (int i = 1; i < szam; i++) {
			
			if (szam % i == 0) {
				osztokOsszege += i;
			}
			
		}
		
		if (osztokOsszege == szam) {
			System.out.println("Tokeletes szam");
		}

	}

}
