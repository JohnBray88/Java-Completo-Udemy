package ativEstruturaWhileExerRes01;

import java.util.Scanner;

public class AtivEstruturaSequencialExerRes01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x=0,y=0;
		
		do {
			System.out.println("Enter the value of X and Y: ");
			x = sc.nextInt();
			y = sc.nextInt();
			if(y > x) {
				System.out.println("Crescent.");
				System.out.println();
			}else if(y < x) {
				System.out.println("Decrescent.");
				System.out.println();
			}else if(x == y) {
				System.out.println("Equals Numbers.");
			}
		}while(x !=y);
		sc.close();
	}

}
