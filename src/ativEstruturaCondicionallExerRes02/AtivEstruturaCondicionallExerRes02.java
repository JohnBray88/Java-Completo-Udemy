package ativEstruturaCondicionallExerRes02;

import java.util.Scanner;

public class AtivEstruturaCondicionallExerRes02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double A,B,C;
		double baskatX1,baskatX2,delta;
		
		System.out.println("Enter the value of A, B and C: ");
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		sc.close();
		delta = (Math.pow(B, 2) -4.0*A*C);
		//System.out.println(delta);
		if(A == 0) {
			System.out.println();
			System.out.println("Value of A: "+A);
			System.out.println("A is equal to zero.");
		}else if (delta < 0) { 
			System.out.println(); System.out.println("Delta: " +delta); 
			System.out.println("Delta is less than zero.");
		}else {
			baskatX1 =((-B + Math.sqrt(delta)) / (2*A));
			baskatX2 = ((-B - Math.sqrt(delta)) / (2*A));
			System.out.println("");
			System.out.println("Delta: "+delta);
			System.out.println("Baskat X1: "+baskatX1);
			System.out.println("Baskat X2: "+baskatX2);
		}
		
	}

}
