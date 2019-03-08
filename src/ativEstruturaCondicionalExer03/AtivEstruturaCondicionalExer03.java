package ativEstruturaCondicionalExer03;
import java.util.Scanner;

public class AtivEstruturaCondicionalExer03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a,b;
		
		System.out.println("Enter with two number: ");
		a = sc.nextInt();
		b = sc.nextInt();
		sc.close();
		
		if (a % b ==0 || b % a ==0) {
			System.out.println("\n==================================");
			System.out.println("\nAre Multiple.");
		}else {
			System.out.println("\n==================================");
			System.out.println("\nAre not Multiple.");
		}
		
		
	}

}
