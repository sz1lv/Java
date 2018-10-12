package tombok;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	static Scanner beolvas = new Scanner(System.in);

	public static void main(String[] args) {

		//1. feladat
//		try {
//			int[] szamok = new int[10]; // inicializálás, 10 hosszú
//			
//			for (int i = 0; i < szamok.length; i++) { //körbejárás
//				System.out.println((i+1) + ") Adj egy számot: "); //Felhasználó számára szöveg
//				szamok[i] = beolvas.nextInt(); //tömbnek értékadása
//			}
//			//Tömb kiírása
//			System.out.println("A számok, amit bekértünk: ");
//			for (int i = 0; i < szamok.length; i++) {
//				System.out.print(szamok[i] + ", ");
//			}
//		} catch (InputMismatchException e) {
//			System.out.println("Nem számot adtál meg!");
//		} catch (Exception e) {
//			System.err.println("Hiba történt a programban.");
//		}
		
		//2. feladat
//		try {
//			System.out.println("Adja meg a tömb hosszát: ");
//			int db = beolvas.nextInt();
//			float[] szamok = new float[db];
//			float sum = 0;
//			
//			for (int i = 0; i < szamok.length; i++) {
//				System.out.println((i+1) + ") Adj egy számot: ");
//				szamok[i] = beolvas.nextFloat();
//				sum += szamok[i];
//			}
//			
//			//Tömb kiírása
//			System.out.println("A számok, amit bekértünk: ");
//			for (int i = 0; i < szamok.length; i++) {
//				System.out.print(szamok[i] + ", ");
//			}
//			System.out.println("Számok összege: " + sum);
//			
//		} catch (InputMismatchException e) {
//			System.out.println("Nem számot adtál meg!");
//		} catch (Exception e) {
//			System.err.println("Hiba történt a programban.");
//		}
		
		//3. feladat
//		try {
//		System.out.println("Adja meg a tömb hosszát: ");
//		int db = beolvas.nextInt();
//		float[] szamok = new float[db];
//		float sum = 0;
//			System.out.println("Kérek egy számot: ");
//		int szam = beolvas.nextInt();
//			
//			for (int i = 0; i < szamok.length; i++) {
//				System.out.println((i+1) + ") Adj egy számot: ");
//				szamok[i] = beolvas.nextInt();
//				sum += szamok[i];
//				if (szamok[i] % 2 == 0) {
//					paros++;
//				}
//			}
//			//Tömb kiírása
//			System.out.println("Számok : ");
//			System.out.println("A számok, amit bekértünk: ");
//			for (int i = 0; i < szamok.length; i++) {
//				System.out.print(szamok[i] + ", ");
//			}
//			System.out.println("Átlag: "+ (double) sum / szamok.length);
//			System.out.println("Párosok száma: "+ paros);
//			
//		} catch (InputMismatchException e) {
//			System.out.println("Nem számot adtál meg!");
//		} catch (Exception e) {
//			System.err.println("Hiba történt a programban.");
//		}
		
		//4. feladat
		
		try {
			String[] hetNapjai = {"hétfő","kedd","szerda","csütörtök","péntek","szombat","vasárnap"};
			
			System.out.println("Kérek egy számot: ");
			int index = beolvas.nextInt();
			System.out.println(hetNapjai[index-1]);
			
		} catch (InputMismatchException e) {
			System.out.println("Nem számot adtál meg!");
		} catch (Exception e) {
			System.err.println("Hiba történt a programban.");
		}

	}
}
