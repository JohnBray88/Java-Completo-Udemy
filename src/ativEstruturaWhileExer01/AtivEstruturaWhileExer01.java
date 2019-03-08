package ativEstruturaWhileExer01;

import java.util.Scanner;

public class AtivEstruturaWhileExer01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		final int password = 2002;
		int n = 0;
		while(password != n) {
			System.out.println();
			System.out.println("====================SECRET PASSWORD========================");
			System.out.println("Enter a password: ");
			n = sc.nextInt();
			if(password != n) {
				System.out.println("Access denied.");
			}
		}
		sc.close();
		System.out.println("Acess allowed.");

	}

}
