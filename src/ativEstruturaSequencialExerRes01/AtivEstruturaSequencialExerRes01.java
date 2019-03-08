package ativEstruturaSequencialExerRes01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AtivEstruturaSequencialExerRes01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat df = new DecimalFormat("0.00");
		Scanner sc = new Scanner(System.in);
		float widthRectangle,lenghtRectangle,areaGround,priceSquareMeter,priceGround;
		
		System.out.println("Enter the value terren width: ");
		widthRectangle = sc.nextFloat();
		System.out.println("Enter the value terren lenght: ");
		lenghtRectangle =  sc.nextFloat();
		System.out.println("Enter the price of the square meter: ");
		priceSquareMeter = sc.nextFloat();
		sc.close();
		areaGround = widthRectangle * lenghtRectangle;
		priceGround = areaGround * priceSquareMeter;
		
		System.out.println();
		System.out.println("Area of the terren: "+df.format(areaGround));
		System.out.println("Price of the terren: "+df.format(priceGround));
	}

}
