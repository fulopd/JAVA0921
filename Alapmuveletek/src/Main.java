
public class Main {
	//ctrl + shif + f - auto formázás
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);

		System.out.println("Összead: " + osszead(a, b));
		System.out.println("Kivon: " + kivon(a, b));
		System.out.println("Oszt: " + oszt(a,b));
		System.out.println("Szoroz: " + szorzas(a, b));
	}

	static public int osszead(int a, int b) {
		return a + b;
	}

	static public int kivon(int a, int b) {
		return a - b;
	}

	static public double oszt(int a, int b) {
		return a / b;
	}

	static public int szorzas(int a, int b) {
		return a*b;
	}
}
