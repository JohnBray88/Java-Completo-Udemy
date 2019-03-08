package ativEstruturaCondicionalExer02;
import java.util.Scanner;
public class AtivEstruturaCondicionalExer02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n1;
		System.out.println("Enter a number: ");
		n1 = sc.nextInt();
		sc.close();
		
		if(n1 % 2 == 0) {
			System.out.println("\n==================================");
			System.out.println("\nPair Number.");
		}else {
			System.out.println("\n==================================");
			System.out.println("\nOdd Number.");
		}
	}

}
