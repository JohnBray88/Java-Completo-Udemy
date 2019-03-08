package ativEstruturaSequencialExer01;

import java.util.Scanner;

public class AtivEstruturaSequencialExer01 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Insert the firt value: ");
		int v1= sc.nextInt();
		sc.nextLine();
		System.out.println("Insert the secound value: ");
		int v2= sc.nextInt();
		sc.nextLine();
		sc.close();
		int totalSum= v1+v2;
		System.out.println();
		System.out.println("The sum of the "+v1+" and "+v2+" = "+totalSum);
	}
}
