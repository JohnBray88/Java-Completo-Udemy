package ativEstruturaSequencialExer03;

import java.util.Scanner;

public class AtivEstruturaSequencialExer03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert the value of the A: ");
		float A = sc.nextFloat();
		sc.nextLine();
		System.out.println("Insert the value of the B: ");
		float B = sc.nextFloat();
		sc.nextLine();
		System.out.println("Insert the value of the C: ");
		float C = sc.nextFloat();
		sc.nextLine();
		System.out.println("Insert the value of the D: ");
		float D = sc.nextFloat();
		sc.nextLine();
		sc.close();
		float different = ((A * B)-(C * D));
		System.out.println("Result: "+ different);
	}
}
