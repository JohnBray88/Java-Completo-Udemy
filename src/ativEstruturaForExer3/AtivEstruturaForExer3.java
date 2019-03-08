package ativEstruturaForExer3;

import java.util.Scanner;
import java.text.DecimalFormat;
public class AtivEstruturaForExer3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.#");
		int qtdeTest;
		float n1=0,n2=0,n3=0,avgNote=0;
		
		System.out.println("Enter the numbers of testes cases: ");
		qtdeTest = sc.nextInt();
		
		for(int i = 1;i <=qtdeTest;i++) {
			System.out.println("============================================================");
			System.out.println("Test "+i);
			System.out.println("Enter the firt note: ");
			n1 = sc.nextFloat();
			System.out.println("Enter the second note: ");
			n2 = sc.nextFloat();
			System.out.println("Enter the third note: ");
			n3 = sc.nextFloat();
			avgNote = ((n1*2)+(n2*3)+(n3*5))/10;
			System.out.println();
			System.out.println("==============================");
			System.out.println("Average Note: "+df.format(avgNote));
			System.out.println();
			System.out.println("============================================================");
		}
		sc.close();
	}

}
