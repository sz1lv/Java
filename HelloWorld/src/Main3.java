
public class Main3 {

	public static void main(String[] args) {
		int b = 500000;
		if (b >= 100 && b < 1000) {
			System.out.println("Háromjegyű");
		} else if(b <= 10) {
			System.out.println("Kétjegyű");
		} else {
			System.out.println("Nem háromjegyű");
		}
		System.out.println(b);
		
		// /////////////////////////////////////////////
		
		int szam = 10;
		switch(szam) {
		case 0:
			System.out.println("NULLA");
			break;
		case 1:
			System.out.println("EGY");
			break;
		case 2:
			System.out.println("KETTŐ");
			break;
		default:
			System.out.println("Rosszat adtál meg!");
			break;
			
		}
		
		
	}

}
