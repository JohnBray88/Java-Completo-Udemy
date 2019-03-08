package ativPooExer4;

import java.util.Scanner;

public class Aplicattion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("What is the dollar price? ");
		CurrencyConverter.priceDollar = sc.nextFloat();
		System.out.println("How many dollars will be bought? ");
		CurrencyConverter.qtdeDollar= sc.nextFloat();
		
		System.out.println();
		System.out.println("===============================================");
		System.out.println("Amount to be paid in reais = "+CurrencyConverter.converterCoin());
		System.out.println("===============================================");
		
		sc.close();
	}

}
