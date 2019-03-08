package ativEstruturaForExer2;

import java.util.Scanner;

public class AtivEstruturaForExer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int qtdeN,totalIn=0,totalOut=0,n;
		System.out.println("Enter the number of loops: ");
		qtdeN = sc.nextInt();
		
		for(int i = 1 ;i<=qtdeN;i++) {
			System.out.println("Enter a number: ");
			n = sc.nextInt();
			if(n >=10 && n <=20) {
				totalIn++;
			}else {
				totalOut++;
			}
		}
		sc.close();
		System.out.println();
		System.out.println("In: "+totalIn);
		System.out.println("Out: "+totalOut);
	}

}
