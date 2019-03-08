package ativEstruturaCondicionalExer04;

import java.util.Scanner;

public class AtivEstruturaCondicionalExer04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int hrInitial,hrFinal,duration;
		
		System.out.println("Enter the starting time of the game: ");
		hrInitial = sc.nextInt();
		System.out.println("Enter the final time of the game: ");
		hrFinal = sc.nextInt();
		sc.close();
		if (hrInitial < hrFinal) {
			duration = hrFinal - hrInitial;
		}else {
			duration = 24 - hrInitial + hrFinal;
		}
		System.out.println();
		System.out.println("The Total hour playing game is "+ duration+" hours");
	}

}
