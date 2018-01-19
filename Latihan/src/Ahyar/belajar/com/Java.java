package Ahyar.belajar.com;

import java.util.Scanner;

public class Java {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("namanya siapa? ");
		String Nama = scan.nextLine();
		System.out.println("Hobi kamu apa?");
		String Hobi = scan.nextLine();
		System.out.println("kalau umur kamu brapa ?");
		byte umur = scan.nextByte();
		System.out.println("Hallo " + Nama + " HOBIMU: " + Hobi+ " UMURMU: " + umur );
	
		
	}

}
