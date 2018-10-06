/**
 * @author Vincze Szilvia
 **/
public class Main {

	public static void main(String[] args) {

		/*
		 * System.out.println(args[0] + " " + args[1]); //összekötöttük az
		 * argumentumokat System.out.println();
		 */

		int i = 10;
		double j = 2.5;
		char a = 'a'; // karaktert ''-el, stringet ""-el
		char A = 65;
		String szoveg = "valami";
		boolean igazE = true;

		final double PI = 3.14;

		String szo = igazE ? "igaz" : "hamis"; // terminális opertátor
		// vagy
		if (igazE) {
			System.out.println("igaz");
		} else {
			System.out.println("hamis");
		}

		System.out.println(i + " " + j + " " + a + " " + A + " " + szoveg + " " + igazE); // println: utána új sor
		System.out.println(PI);
		System.out.println(szo); // !: negálom, tehát hamis lesz

		// kommentbe tettem a felső argumentumokat és ehhez újat csináltam
		/*int egy = Integer.parseInt(args[0]);
		int ketto = Integer.parseInt(args[1]);
		int harom = Integer.parseInt(args[2]);

		int terfogat = egy * ketto * harom;
		int felszin = 2 * (egy * ketto + egy * harom + ketto * harom);

		System.out.println("Térfogat= " + terfogat);
		System.out.println("Felszín= " + felszin);*/
		
		//kalkulátor
		int elso = Integer.parseInt(args[0]);
		int masodik = Integer.parseInt(args[1]);
		
		int osszeg = elso + masodik;
		int kulonbseg = elso - masodik;
		int szorzat = elso * masodik;
		double hanyados = (double) elso / masodik;
		
		System.out.println("Összeg: " + osszeg);
		System.out.println("Különbség: " + kulonbseg);
		System.out.println("Szorzat: " + szorzat);
		System.out.println("Hányados: " + hanyados); //commit test
		System.out.println();

	}

}
