package ativEstruturaCondicionalExer06;

import java.util.Scanner;

public class AtivEstruturaCondicionalExer06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		float interval;
		
		System.out.println("Enter the value: ");
		interval = sc.nextFloat();
		sc.close();
		
		/*
		 * if(interval >= 0 && interval <= 25) { System.out.println();
		 * System.out.println("Interval: [0,25]"); }else if(interval >= 25 && interval
		 * <= 50) { System.out.println(); System.out.println("Interval: [25,50]"); }else
		 * if(interval >= 50 && interval <= 75) { System.out.println();
		 * System.out.println("Interval: [50,75]"); }else if(interval >= 75 && interval
		 * <= 100) { System.out.println(); System.out.println("Interval: [75,100]");
		 * }else { System.out.println("Fora do Intervalo"); }
		 */
		 
		
		if(interval < 0 && interval > 100) {
			System.out.println("FORA DO INTERVALO!!.");
		}else if(interval <= 25) {
			System.out.println();
			System.out.println("Interval: [0,25]");
		}else if(interval <= 50) {
			System.out.println();
			System.out.println("Interval: [25,50]");
		}else if(interval <= 75) {
			System.out.println();
			System.out.println("Interval: [50,75]");
		}else{
			System.out.println();
			System.out.println("Interval: [75,100]");
		
		}	
	}

}
