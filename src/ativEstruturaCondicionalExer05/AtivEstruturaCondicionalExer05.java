package ativEstruturaCondicionalExer05;
import java.util.Scanner;

public class AtivEstruturaCondicionalExer05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int cod,qtdeProduct;
		String food;
		float priceProduct;
		float totalProduct;
		
		System.out.println("Enter the product code: ");
		cod = sc.nextInt();
		System.out.println("Enter the quantity of products: ");
		qtdeProduct= sc.nextInt();
		sc.close();
		/*
		 * if (cod==1) { priceProduct = 4.00f; totalProduct = qtdeProduct *
		 * priceProduct; food = "Cachorro Quente"; System.out.println();
		 * System.out.println("Procuct: "+food+" | Total Price: "+totalProduct); }else
		 * if(cod==2) { priceProduct = 4.50f; totalProduct = qtdeProduct * priceProduct;
		 * food = "X-Salada"; System.out.println();
		 * System.out.println("Procuct: "+food+" | Total Price: "+totalProduct); }else
		 * if(cod==3) { priceProduct = 5.00f; totalProduct = qtdeProduct * priceProduct;
		 * food = "X-Bacon"; System.out.println();
		 * System.out.println("Procuct: "+food+" | Total Price: "+totalProduct); }else
		 * if(cod==4) { priceProduct = 2.00f; totalProduct = qtdeProduct * priceProduct;
		 * food = "Torrada Simples"; System.out.println();
		 * System.out.println("Procuct: "+food+" | Total Price: "+totalProduct); }else
		 * if(cod==5) { priceProduct = 1.50f; totalProduct = qtdeProduct * priceProduct;
		 * food = "Refrigerante"; System.out.println();
		 * System.out.println("Procuct: "+food+" | Total Price: "+totalProduct); }else {
		 * System.out.println("Error"); }
		 */
		switch (cod) {
		case 1:
			priceProduct = 4.00f; totalProduct = qtdeProduct *
			priceProduct; food = "Cachorro Quente"; System.out.println();
			System.out.println("Procuct: "+food+" | Total Price: "+totalProduct);
			break;
		case 2:
			priceProduct = 4.50f; totalProduct = qtdeProduct * priceProduct;
			food = "X-Salada"; System.out.println();
			System.out.println("Procuct: "+food+" | Total Price: "+totalProduct);
			break;
		case 3:
			priceProduct = 5.00f; totalProduct = qtdeProduct * priceProduct;
			food = "X-Bacon"; System.out.println();
			System.out.println("Procuct: "+food+" | Total Price: "+totalProduct);
			break;
		case 4:
			priceProduct = 2.00f; totalProduct = qtdeProduct * priceProduct;
			food = "Torrada Simples"; System.out.println();
			System.out.println("Procuct: "+food+" | Total Price: "+totalProduct);
			break;
		case 5:
			priceProduct = 1.50f; totalProduct = qtdeProduct * priceProduct;
			food = "Refrigerante"; System.out.println();
			System.out.println("Procuct: "+food+" | Total Price: "+totalProduct); 
			break;
		default: 
			System.out.println();
			System.out.println("Erro"); 
			break;
		}
	}

}
