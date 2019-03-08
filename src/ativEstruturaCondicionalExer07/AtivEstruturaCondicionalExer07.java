package ativEstruturaCondicionalExer07;

import java.util.Scanner;

public class AtivEstruturaCondicionalExer07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double nx,ny;
		
		System.out.println("Enter the value of X: ");
		nx=sc.nextDouble();
		System.out.println("Enter the value of Y: ");
		ny=sc.nextDouble();
		sc.close();
		
		if(nx == 0.0 && ny ==0.0) {
			System.out.println("Origin.");
		}else if (nx == 0.0) {
			System.out.println("Axis Y");
		}else if (ny == 0.0) {
			System.out.println("Axis X");
		}else if (nx > 0.0 && ny > 0.0) {
			System.out.println("Q1");
		}else if (nx < 0.0 && ny > 0.0) {
			System.out.println("Q2");
		}else if (nx < 0.0 && ny < 0.0) {
			System.out.println("Q3");
		}else if(nx > 0.0 && ny < 0.0) {
			System.out.println("Q4");
		}else {
			System.out.println("ERRO.");
		}
	}

}
