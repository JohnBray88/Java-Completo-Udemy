package ativEstruturaCondicionalExer08;

import java.util.Scanner;
import java.text.DecimalFormat;
public class AtivEstruturaCondicionalExer08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.####");
		final float capSalary1 = 2000.00f;
		final float capSalary2 = 3000.00f;
		final float capSalary3 = 4500.00f;
		float salary;
		float totalIR = 0.0f;
		final float IR1 = 0.08f;
		final float IR2 = 0.18f;
		final float IR3 = 0.28f;
		
		System.out.println("Enter the Salary: ");
		salary = sc.nextFloat();
		sc.close();
		
		if (salary <= capSalary1) {
			totalIR = 0;
		}else if(salary > capSalary1 && salary <= capSalary2) {
			totalIR = (salary - capSalary1) * IR1;
		}else if(salary > capSalary2 && salary <= capSalary3){
			totalIR = (((capSalary2 - capSalary1) * IR1) + ((salary - capSalary2) * IR2));
		}else if(salary >capSalary3) {
			totalIR = (((capSalary2 - capSalary1) * IR1) + ((capSalary3 - capSalary2) * IR2) + ((salary - capSalary3) * IR3));
		}
		if(totalIR == 0) {
			System.out.println();
			System.out.println("Salary: R$ "+df.format(salary)+".");
			System.out.println("Income Tax: Isento.");
			System.out.println("");
		}else {
			System.out.println();
			System.out.println("Salary: R$ "+df.format(salary));
			System.out.println("Income Tax: R$ "+df.format(totalIR));
		}
	}
}
