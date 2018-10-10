package ciklusok;

public class Main {

	public static void main(String[] args) {
		//1. feladat
		if(args.length > 0) {
			System.out.println("Paraméterek: ");
			for (int i = 0; i < args.length; i++) {
				System.out.println(args[i]);
			}
		} else {
			System.out.println("Nem adtál meg paramétert.");
		}
		
		//2. feladat
		System.out.println("Páros számok: ");
		for (int i = 1; i < 20; i++) {
			if(i % 2 == 0)
			System.out.print(i + ", ");
		} System.out.println();
		
		//3. feladat
		System.out.println("Hárommal osztható számok: ");
		if(args.length == 2) {
			int tol = Integer.parseInt(args[0]);
			int ig = Integer.parseInt(args[1]);
			
			System.out.println("Számok: ");
			for (int i = tol; i < ig; i++) {
				if(i % 3 == 0)
					System.out.print(i + ", ");
			}
		} else {
			System.err.println("Két paramétert várok.");
		}
		
		//4. feladat
		int n = 17;
		for (int i=1; i<=Math.sqrt(n); i++) 
        { 
            if (n%i==0) 
            {
                if (n/i == i) 
                    System.out.printf("%d", i);
                else
                    System.out.printf("%d %d ", i, n/i); 
            } 
        } 
		
		//5. feladat
		
		
		
		//6. feladat
		
		
				/*int iosszeg = i + i;
				if(iosszeg == num) {
				System.out.println("A szám tökéletes.");
				} else {
					System.out.println("A szám nem tökéletes.");
				}*/
				
		//8. feladat
		System.out.println("8. feladat");
		String szam1 = "123456";
		int sum = 0;
		for (int i = 0; i < szam1.length(); i++) {
			String temp = "" + szam1.charAt(i);
			sum += Integer.parseInt(temp);
		}
		System.out.println(sum);
			

	}

}
