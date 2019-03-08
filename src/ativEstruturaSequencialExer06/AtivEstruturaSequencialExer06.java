package ativEstruturaSequencialExer06;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AtivEstruturaSequencialExer06 {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("0.000");
		float a,b,c;
		float areaTriangleRetang,areaSquare,areaCircle,areaRectangle,areaTrapeze;
		float baseTR,heightTR,baseTrape1,baseTrape2,heightTrape,sideSquare,sideRectangle1,sideRectangle2,rCircle;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of the A, B and C: ");
		a=sc.nextFloat();
		b=sc.nextFloat();
		c=sc.nextFloat();
		sc.close();
		
		baseTR = a;
		heightTR = c;
		baseTrape1 = a;
		baseTrape2 = b;
		heightTrape = c;
		rCircle=c;
		sideSquare = b;
		sideRectangle1 = a;
		sideRectangle2 = b;
		areaTriangleRetang = (baseTR * heightTR) /2;
		areaCircle = (float)(Math.PI * (Math.pow(rCircle,2.0)));
		areaTrapeze = ((baseTrape1 + baseTrape2) * heightTrape) / 2;
		areaSquare =  (float)(Math.pow(sideSquare, 2));
		areaRectangle = sideRectangle1 * sideRectangle2;
		
		System.out.println();
		System.out.println("====================================");			
		System.out.println();
		System.out.println("Triangle: "+df.format(areaTriangleRetang));
		System.out.println("Circle: "+df.format(areaCircle));
		System.out.println("Trapeze: "+df.format(areaTrapeze));
		System.out.println("Square: "+df.format(areaSquare));
		System.out.println("Rectangle: "+df.format(areaRectangle));
		
		
		
	}
}
