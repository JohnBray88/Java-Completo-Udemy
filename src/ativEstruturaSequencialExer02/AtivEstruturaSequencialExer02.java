package ativEstruturaSequencialExer02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AtivEstruturaSequencialExer02 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.####");
		
		  //final Double pi = 3.14159;
		  System.out.println("Insert the value of the ratio: "); 
		  Double ratioCircle=sc.nextDouble(); 
		  Double areaCircle= Math.PI*(Math.pow(ratioCircle,2));
		  sc.close();
		  System.out.println("The area of the circle is: "+df.format(areaCircle));
		 
	}
}
