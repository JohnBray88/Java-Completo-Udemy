package ativEstruturaSequencialExer04;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class AtivEstruturaSequencialExer04 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("'$'0.00");
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		System.out.println("Enter employee number: ");
		int numEmployee = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the worker's work schedule: ");
		float scheduleWork = sc.nextFloat();
		sc.nextLine();
		System.out.println("Enter the value of the hour you work: ");
		float hrWork = sc.nextFloat();
		sc.close();
		float salary = (hrWork * scheduleWork);
		
		System.out.println();
		System.out.println("Number Employee: "+numEmployee);
//		System.out.println("Employee Salary: "+nf.format(df.format(salary)));
		System.out.println("Employee Salary: "+df.format(salary));

		
		
		
		
		
		
	}	
}
