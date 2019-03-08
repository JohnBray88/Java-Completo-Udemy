package ativEstruturaCondicionallExerRes01;

import java.util.Scanner;
import java.text.DecimalFormat;
public class AtivEstruturaCondicionallExerRes01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.#");
		float n1,n2;
		float avg;
		final float avgInstitute = 60.0f;
		
		System.out.println("Enter the note of first semester: ");
		n1 = sc.nextFloat();
		System.out.println("Enter the note of second semester: ");
		n2 = sc.nextFloat();
		avg = n1 + n2;
		sc.close();
		
		if (avg < avgInstitute) {
			System.out.println();
			System.out.	println("Final Average: "+df.format(avg)+" --- DISAPRROVED.");
		}else if(avg >= avgInstitute) {
			System.out.println();
			System.out.println("Final Average: "+df.format(avg)+" --- APRROVED.");
		}
		
	}

}
