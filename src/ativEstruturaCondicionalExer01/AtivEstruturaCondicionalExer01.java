package ativEstruturaCondicionalExer01;

import java.util.Scanner;

public class AtivEstruturaCondicionalExer01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n1;
		
		System.out.println("Enter a number: ");
		n1 = sc.nextInt();
		sc.close();
		
		if(n1 >= 0) {
			System.out.println("\n==================================");
			System.out.println("\nPositive.");
		}else {
			System.out.println("\n==================================");
			System.out.println("\nNegative.");
		}
		
	}

}
