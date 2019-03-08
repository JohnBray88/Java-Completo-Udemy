package ativEstruturaForExer5;

import java.util.Scanner;

public class AtivEstruturaForExer5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n,fatN=1;
		System.out.println("Enter a number: ");
		n = sc.nextInt();
		
		for(int i = 1;i <= n;i++) {
			fatN = fatN * i;
		}
		System.out.println("Factorial: "+fatN);
		sc.close();
	}
	
}
