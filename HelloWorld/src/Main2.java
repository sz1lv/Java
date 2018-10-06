
public class Main2 {
	public static void main(String[] args) {

		/*
		 * int a = Integer.parseInt(args[0]); int b = Integer.parseInt(args[1]); int c =
		 * Integer.parseInt(args[2]); int d = Integer.parseInt(args[3]); int e =
		 * Integer.parseInt(args[4]);
		 * 
		 * int atlag = (double) (a + b + c + d + e) / args.length; //tömb hossza
		 * 
		 * System.out.println("Átlag= " + atlag);
		 */

		// Másodfokú egyenlet:
		int szam1 = Integer.parseInt(args[0]);
		int szam2 = Integer.parseInt(args[1]);
		int szam3 = Integer.parseInt(args[2]);

		// ez nem jó, mert NaN-t ad
		/*
		 * double eredmeny = ((- szam2) +- Math.sqrt((Math.pow(szam2,2)) -
		 * (4*szam1*szam3))) / (2* szam1);
		 * 
		 * System.out.println(eredmeny);
		 */

		double diszkriminans = Math.sqrt(szam2 * szam2 - 4 * szam1 * szam3);
		double x1 = (-szam2 + diszkriminans) / 2 * szam1;
		double x2 = (-szam2 - diszkriminans) / 2 * szam1;

		System.out.println(x1);
		System.out.println(x2);

	}
}
