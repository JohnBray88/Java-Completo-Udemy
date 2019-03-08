package ativ2;

import java.util.Scanner;

public class Ativ2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your full name:");
		String name = sc.next(); //Alex Green
		sc.nextLine();
		System.out.println("How many bedrooms are there in your house?");
		int qtdeBedrooms = sc.nextInt(); //3
		sc.nextLine();
		System.out.println("Enter product price:");
		float priceProduct = sc.nextFloat(); //500.50
		sc.nextLine();
		System.out.println("Enter your last name, age and height(same line)");
		String lastName = sc.next(); //Green
		int age = sc.nextInt(); //21
		Float height = sc.nextFloat(); //1.73
		sc.close();
		
		System.out.println("");
		System.out.println(name);
		System.out.println(qtdeBedrooms);
		System.out.println(priceProduct);
		System.out.println(lastName);
		System.out.println(age);
		System.out.println(height);
	}
}
