package ativPooExer3;

import java.util.Scanner;

public class Aplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Student st = new Student();
		
		//Necessário fazer o bloqueamento de entrada de dados errados.
		System.out.println("Enter the name of Student: ");
		st.setName(sc.nextLine());
		System.out.println("Enter the note of first trimester.");
		st.setN1(sc.nextFloat());
		System.out.println("Enter the note of secound trimester.");
		st.setN2(sc.nextFloat());
		System.out.println("Enter the note of third trimester.");
		st.setN3(sc.nextFloat());

		System.out.println();
		System.out.println(st);
	
		
		if(st.avgNoteStudentYear() < st.getAvgNoteYear()) {
			System.out.println();
			System.out.println("===============================================");
			System.out.println("You failed. Missed "+st.missingPoint());
			System.out.println("===============================================");
		}else {
			System.out.println();
			System.out.println("===============================================");
			System.out.println("You Pass. Congratulations.");
			System.out.println("===============================================");
		}
		
		
		sc.close();
	}

}
