package ativEstruturaForExer7;

import java.util.Scanner;

public class AtivEstruturaForExer7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		int n;
		System.out.println("Enter a number: ");
		n = sc.nextInt();
		
		for(int i=1;i <= n;i++) {
			System.out.println(i+" "+Math.pow(i, 2)+" "+Math.pow(i, 3));
		}
		sc.close();
	}

}
