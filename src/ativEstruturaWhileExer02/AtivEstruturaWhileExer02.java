package ativEstruturaWhileExer02;

import java.util.Scanner;

public class AtivEstruturaWhileExer02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		float x = 0 ,y = 0;
	
		do{
			System.out.println();
			System.out.println("Enter the value of X and Y: ");
			x = sc.nextFloat();
			y = sc.nextFloat();
			
			if(x > 0 && y > 0) {
				System.out.println("Belong to quadrante - [1]");
			}else if(x < 0 && y > 0) {
				System.out.println("Belong to quadrante - [2]");
			}else if(x < 0 && y < 0) {
				System.out.println("Belong to quadrante - [3]");
			}else if(x > 0 && y < 0) {
				System.out.println("Belong to quadrante - [4]");
			}
		}while(x != 0 && y !=0);
		sc.close();
	}

}
