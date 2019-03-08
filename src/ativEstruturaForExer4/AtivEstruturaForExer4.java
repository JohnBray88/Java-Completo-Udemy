package ativEstruturaForExer4;

import java.util.Scanner;

public class AtivEstruturaForExer4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int qtdeN;
		float n1=0,n2=0;
		float div=0;
		System.out.println("Enter the amount of loop: ");
		qtdeN = sc.nextInt();
		System.out.println();
		System.out.println("=======================================================");
		for(int i =1;i <= qtdeN;i++) {
			System.out.println("=======================================================");
			System.out.println();
			System.out.println("Enter the first number: ");
			n1 = sc.nextInt();
			System.out.println("Enter the secound number: ");
			n2 =sc.nextInt();
			if(n2 == 0) {
				System.out.println("Impossible Division.");
				System.out.println();
				System.out.println("=======================================================");
			}else {
				div = n1 / n2;
				System.out.println("Division: "+div);
				System.out.println();
				System.out.println("=======================================================");
			}
		}
		sc.close();
	}

}
