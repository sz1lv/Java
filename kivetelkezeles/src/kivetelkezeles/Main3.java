package kivetelkezeles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main3 {
	static Scanner beolvas = new Scanner(System.in); //most ittadjuk meg

	public static void main(String[] args) { //1. feladat
		
		//int szam = 0;
		//int szamlalo = 0;
		
//		try {
//			while ( szam != 11 ) {
//				System.out.println("Adj meg egy számot: ");
//				szam = beolvas.nextInt();
//				szamlalo++;
//			}
//			System.out.println("A 11-es a(z) " + szamlalo + ". volt!");
//		} catch (InputMismatchException e) {
//			System.out.println("Nem számot adtál meg!");
//		} catch (Exception e) {
//			System.err.println("Hiba történt a programban.");
//		}
		
		//2. feladat
		
//		try {
//			System.out.println("Kérek egy számot: ");
//			int szam = beolvas.nextInt();
//			boolean paros = (szam % 2 == 0);
//			if (szam % 3 == 0) {
//				if (paros) {
//					System.out.println("A szám oszható 2-vek és 3-al is.");
//				} else {
//					System.out.println("A szám osztható 3-al, de 2-vel nem.");
//				}
//			} else {
//				if (paros) {
//					System.out.println("A szám osztható 2-vel, de 3-al nem.");
//				} else {
//					System.out.println("Egyikkel sem osztható.");
//				}
//			}
//		} catch (InputMismatchException e) {
//			System.out.println("HNem számot adtál meg!");
//		} catch (Exception e) {
//			System.err.println("Hiba történt a programban.");
//		}
		
		// 3. feladat
//		
//		try {
//			System.out.println("1. szám: ");
//			int szam1 = beolvas.nextInt();
//			System.out.println("2. szám: ");
//			int szam2 = beolvas.nextInt();
//			System.out.println("3. szám: ");
//			int szam3 = beolvas.nextInt();
//			
//			int max = szam1;
//			
//			if (szam2 > max) {
//				max = szam2;
//			}
//			if (szam3 > max) {
//				max = szam3;
//			}
//				System.out.println("A legnagyobb szám: " + max);
//			if (szam1 % 3 == 0 && szam2 % 3 == 0 && szam3 % 3 == 0) {
//				System.out.println("Mind a három osztható 3-al");
//			} else {
//				System.out.println("Nem osztható 3-al mindegyik szám!");
//			}
//				
//			
//		} catch (InputMismatchException e) {
//			System.out.println("Nem számot adtál meg!");
//		} catch (Exception e) {
//			System.err.println("Hiba történt a programban.");
//		}
		
		//4. feladat
		
//		try {
//			System.out.println("1. szám: ");
//			int szam1 = beolvas.nextInt();
//			System.out.println("2. szám: ");
//			int szam2 = beolvas.nextInt();
//			System.out.println("3. szám: ");
//			int szam3 = beolvas.nextInt();
//			System.out.println("4. szám: ");
//			int szam4 = beolvas.nextInt();
//			System.out.println("5. szám: ");
//			int szam5 = beolvas.nextInt();
//			
//			if (szam3 == szam1 + szam2 && szam4 == szam2 + szam3 && szam5 == szam3 + szam4) {
//				System.out.println("Fibonacci sorozat!");
//			} else {
//				System.out.println("Nem Fibonacci sorozat!");
//			}
//			
//		} catch (InputMismatchException e) {
//			System.out.println("Nem számot adtál meg!");
//		} catch (Exception e) {
//			System.err.println("Hiba történt a programban.");
//		}
		
		//5. feladat
		
		try {
			System.out.println("1. szám: ");
			int szam1 = beolvas.nextInt();
			System.out.println("2. szám: ");
			int szam2 = beolvas.nextInt();
			System.out.println("3. szám: ");
			int szam3 = beolvas.nextInt();
			System.out.println("4. szám: ");
			int szam4 = beolvas.nextInt();
			System.out.println("5. szám: ");
			int szam5 = beolvas.nextInt();
			
			double hanyados = (double) szam2 / szam1;
			
			if (szam3 / szam2 == hanyados && szam4 / szam3 == hanyados && szam5 / szam4 == hanyados) {
				System.out.println("Mértani sorozat");
			} else {
				System.out.println("Nem mértani sorozat!");
			}
			
			
		} catch (InputMismatchException e) {
			System.out.println("Nem számot adtál meg!");
		} catch (Exception e) {
			System.err.println("Hiba történt a programban.");
		}
		
	}
}
