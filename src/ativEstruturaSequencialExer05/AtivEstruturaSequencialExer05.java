package ativEstruturaSequencialExer05;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AtivEstruturaSequencialExer05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.println("Enter code of the part, number of the part, unit value of part: ");
		float codepart = sc.nextFloat();
		float qtdePart= sc.nextFloat();
		float unitValuePart =sc.nextFloat();
		
		float result = qtdePart * unitValuePart;
		
		System.out.println(result);
	}
}
