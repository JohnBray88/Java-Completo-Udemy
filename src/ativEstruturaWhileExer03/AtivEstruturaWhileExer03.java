package ativEstruturaWhileExer03;

import java.util.Scanner;

public class AtivEstruturaWhileExer03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int cod=0;
		int totalGasoline=0,totalAlcohol=0,totalDiesel=0;
		do {
			System.out.println("====================================================");
			System.out.println("Enter the code of the combostivel type: ");
			cod = sc.nextInt();
			if(cod ==1) {
				totalAlcohol++;
			}else if(cod==2){
				totalGasoline++;
			}else if(cod==3) {
				totalDiesel++;
			}else if(cod==4){
				System.out.println("====================================================");
				System.out.println("Thank you so much!!");
				System.out.println("Total purchases of gasoline: "+totalGasoline);
				System.out.println("Total purchases of alcohol: "+totalAlcohol);
				System.out.println("Total purchases of diesel: "+totalDiesel);
				System.out.println("====================================================");
			}else {
				System.out.println("Invalid code. Enter a valid code.");
				System.out.println();
			}
		}while(cod !=4);
		sc.close();
	}

}
