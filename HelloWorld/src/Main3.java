
public class Main3 {

	public static void main(String[] args) {
		int b = 500000;
		if (b >= 100 && b < 1000) {
			System.out.println("Háromjegyű");
		} else if (b <= 10) {
			System.out.println("Kétjegyű");
		} else {
			System.out.println("Nem háromjegyű");
		}
		System.out.println(b);

		// /////////////////////////////////////////////

		int szam = 10;
		switch (szam) {
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

		//
		int num = 21;
		if (num % 2 == 0) {
			System.out.println("Páros");
		} else {
			System.out.println("Páratlan");
		}

		//
		int number = 20;

		if (number % 2 == 0) {
			System.out.println("Osztható 2-vel");
		} else {
			System.out.println("Nem osztható 2-vel");

			if (number % 3 == 0) {
				System.out.println("Osztható 3-al");
			} else {
				System.err.println("Nem osztható 3-al");
			}

			if (number % 5 == 0) {
				System.out.println("Osztható 5-el");
			} else {
				System.out.println("Nem osztható 5-el");
			}
		}
		
		// 3. feladat
		/*int szam1 = Integer.parseInt(args[0]);
		int szam2 = Integer.parseInt(args[1]);
		int szam3 = Integer.parseInt(args[2]);
		
		if (szam1 + szam2 > szam3 && szam1 + szam3 > szam2 && szam2 +szam3 > szam1) {
			System.out.println("A háromszög szerkeszthető.");
		} else {
			System.out.println("A háromszög nem szerkeszthető.");
		}
		
		//Számjegyek
		int num2 = 150;
		if (num2 < 10) {
			System.out.println("Egyjegyű");
		} else if (num2 < 100) {
			System.out.println("Kétjegyű");
		} else if (num2 < 1000) {
			System.out.println("Háromjegyű");
		} else if (num2 < 10000) {
			System.out.println("Négyjegyű");
		} else if (num2 < 100000) {
			System.out.println("Ötjegyű");
		} else if (num2 < 1000000) {
			System.out.println("Hatjegyű");
		} else {
			System.out.println("Nem jó a paraméter.");
		}*/
		// vagy
		char[] teszt = args[0].toCharArray();
		if(teszt[0] == '-' ) {
			System.out.println("Ennyi számjegyű: " + (teszt.length-1)); 
		} else {
			System.out.println("Ennyi számjegyű: " + teszt.length);
		}
		
		//Két érték megadása
		int elso = 55;
		int masodik = 14;
		
		if (elso > masodik) {
			System.out.println("Az első szám nagyobb");
		} else if (elso < masodik) {
			System.out.println("Második a nagyobb");
		} else {
			System.out.println("Nem emgfelelőek a paraméterek.");
		}
		
	}
}
