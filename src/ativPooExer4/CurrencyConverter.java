package ativPooExer4;

public class CurrencyConverter {
	static float priceDollar;
	static float priceReal;
	static float qtdeDollar;
	public static final float IOF = 0.06f;
	
	public static float converterCoin() {
		return ((qtdeDollar * priceDollar)*IOF)+(qtdeDollar * priceDollar);
	}
}
