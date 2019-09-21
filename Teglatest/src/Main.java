
public class Main {

	public static void main(String[] args) {
		
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		
		
		System.out.println("Felszín: " + felszin(a,b,c));
		System.out.println("Térfogat: " + terfogat(a, b, c));

	}
	
	
	static public int felszin(int a, int b, int c) {
		
		return 2*(a*b + b*c + a*c);
	}
	
	static public int terfogat(int a, int b, int c) {
		
		return a*b*c;
	}
	

}
