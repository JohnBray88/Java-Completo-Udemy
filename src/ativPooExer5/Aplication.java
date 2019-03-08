package ativPooExer5;

import java.util.Scanner;

public class Aplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Bank b ;
		double balance = 0;
		System.out.println("Enter account number: ");
		int numbAccount = sc.nextInt();
		System.out.println("Enter account holder: ");
		String holderName = sc.next();
		System.out.println("Is there an initial deposit (y/n)? ");
		char in = sc.next().charAt(0);
		if (in == 'y') {
			System.out.println("Enter initial deposit value: ");
			balance = sc.nextDouble();
			 b = new Bank(holderName, numbAccount, balance);
		}else{
			b = new Bank(holderName, numbAccount);
		}
		System.out.println(b);

		System.out.println();
		System.out.println("==================================================================");
		System.out.println("Enter a deposit value: ");
		b.deposit(sc.nextDouble());
		System.out.println();
		System.out.println("==================================================================");
		System.out.println("Update Account Data: ");
		System.out.println(b);

		System.out.println("==================================================================");
		System.out.println("Enter a withdraw value: ");
		b.drawOut(sc.nextDouble());
		System.out.println("==================================================================");
		System.out.println("Update Account Data: ");
		System.out.println(b);
		
		sc.close();
	}
}
