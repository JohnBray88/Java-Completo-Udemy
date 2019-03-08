package ativEstruturaForExer1;

import java.util.Scanner;

public class AtivEstruturaForExer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x;
		System.out.println("Enter a number: ");
		x = sc.nextInt();
		
		for(int i=1;i<=x;i++) {
			if(i % 2 !=0) {
				System.out.println(i);
			}
		}
		sc.close();
	}

}
