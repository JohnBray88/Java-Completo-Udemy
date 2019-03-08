package ativEstruturaCondicionallExerRes03;

import java.util.Scanner;

public class AtivEstruturaCondicionallExerRes03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n1,n2,n3,bigger=0;
		
		System.out.println("Enter three numbers: ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		sc.close();
		if (n1>n2 && n1>n3 || n1==n2 || n1==n3) {
			bigger = n1;
		}else if(n2>n1 && n2>n3 || n2==n1 || n2==n3) {
			bigger = n2;
		}else if(n3>n2 && n3>n1 || n3==n2 || n3==n1) {
			bigger = n3;
		}
		System.out.println();
		System.out.println("Bigger is "+bigger);
	}

}
