package ativEstruturaForExer6;

import java.util.Scanner;

public class AtivEstruturaForExer6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter a number: ");
		n = sc.nextInt();
		for(int i = 1;i <= n;i++) {
			if(n % i ==0) {
				System.out.println("Div: "+i);
			}
		}
		sc.close();
	}

}
