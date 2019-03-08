package ativEstruturaWhileExerRes02;

import java.util.Scanner;

public class AtivEstruturaWhileExerRes02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int totalAge=0,age,sumAge=0;
		float avgAge=0;
		
		System.out.println("Enter you age: ");
		age = sc.nextInt();
		while(age > 0) {
			if(age > 0) {
				totalAge++;
				sumAge= sumAge + age;
			}else if(age < 0){
				System.out.println("Impossible to calculate.");
			}
			System.out.println("Enter you age again: ");
			age = sc.nextInt();
		}
		avgAge = sumAge / totalAge;
		System.out.println();
		System.out.println("Total of age is "+avgAge);
		sc.close();
	}

}
