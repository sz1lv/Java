package kivetelkezeles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) { //Scanner + ctrl+space
		
			Scanner beolvas = new Scanner(System.in); //Scanner osztály
//			System.out.println("Kérek egy szót: ");
//			String beolvasottadat = beolvas.nextLine(); //egy szót, betűt tudunk megadni/beolvasni a next(), a nextLine többet
//			System.out.println(beolvasottadat);
//			beolvas.close();
			
//			try {
//				System.out.println("Kérek egy számot: ");
//				int szam = beolvas.nextInt();
//				double eredmeny = (double) 1 / szam;
//				System.out.println("A szám reciproka: ");
//				System.out.println(eredmeny);
//			} catch (InputMismatchException e) {
//				System.out.println("Hibás szám formátum! \n Számot kérek!");
//			}
//			beolvas.close();
			
			try {
				System.out.println("Kérek egy karaktert: ");
				char karakter = beolvas.next().charAt(0);
				System.out.println("A karakter: ");
				System.out.println((int) karakter);
			} catch (InputMismatchException e) {
				System.out.println(e);
			}
			beolvas.close();
		
	}

}
