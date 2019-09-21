
public class Main {

	public static void main(String[] args) {

		// 5.feladat

		// IĚ�rj programot, amely a parameĚ�terkeĚ�nt adott keĚ�t szaĚ�mroĚ�l eldoĚ�nti,
		// hogy melyik a nagyobb! VizsgaĚ�ld meg, hogy a felhasznaĚ�loĚ� valoĚ�ban
		// keĚ�t parameĚ�tert adott-e meg; keĚ�t eĚ�rteĚ�k eseteĚ�n hajtsd veĚ�gre az
		// oĚ�sszehasonliĚ�taĚ�st,
		// ellenkezoĚ‹ esetben iĚ�rj ki hibauĚ�zenetet!

		if (args.length == 2) {
			int szam1 = Integer.parseInt(args[0]);
			int szam2 = Integer.parseInt(args[1]);

			if (szam1 > szam2) {
				System.out.println("Az első szám nagyobb");
			} else if (szam1 < szam2) {
				System.out.println("Második nagyobb");
			} else if (szam1 == szam2) {
				System.out.println("Egyenlő");
			}

		} else {

			System.out.println("Hiba");

		}

	}

}
