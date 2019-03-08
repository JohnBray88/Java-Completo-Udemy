package ativPooExer1;

import java.util.Scanner;

public class Aplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Rectangle rect = new Rectangle();
		System.out.println("Enter rectangle width and height: ");
		rect.setWidth(sc.nextDouble());
		rect.setHeight(sc.nextDouble());
		
		System.out.println();
		System.out.println(rect);
		
		
		sc.close();
	}

}
