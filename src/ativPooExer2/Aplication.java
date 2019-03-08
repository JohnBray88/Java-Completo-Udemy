package ativPooExer2;

import java.util.Scanner;

public class Aplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Employee em = new Employee();
		
		System.out.println("Enter your name: ");
		em.setName(sc.nextLine());
		System.out.println("Enter your gross salary: ");
		em.setGrossSalary(sc.nextDouble());
		System.out.println("Enter the tax of salary: ");
		em.setTax(sc.nextDouble());
		
		System.out.println();
		System.out.println(em);
		
		System.out.println();
		System.out.println("Which percentage to increase salary: ");
		em.increaseSalary(sc.nextDouble());
		
		System.out.println();
		System.out.println("Update data: "+em);
		
		sc.close();
	}

}
