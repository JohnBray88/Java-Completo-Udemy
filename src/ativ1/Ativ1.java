package ativ1;
import java.text.DecimalFormat;
import java.util.Locale;

public class Ativ1 {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#.000");
		//String product1="Computer";
		//String product2="Office desk";
		
		//int age = 30;
		//int code=5290;
		char gender='F';
		
		double price1=2100.0;
		double price2=650.50;
		double measure=53.234567;
		
		System.out.println("Products:");
		System.out.println("Computer,which price is $ "+ price1);
		System.out.println("Office desk, which price is $ "+price2);
		System.out.println("\nRecord: 30 years old, code 5290 and gender: "+gender);
		System.out.println("\nMeasue with eight decimal places: "+measure);
		System.out.println("Rouded (three decimal places): "+df.format(measure));
		Locale.setDefault(Locale.US);
		System.out.println("US decimal point: "+df.format(measure));
	}
}
