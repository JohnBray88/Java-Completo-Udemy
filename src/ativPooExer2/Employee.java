package ativPooExer2;

public class Employee {
	private String name;
	private double grossSalary;
	private double tax;
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getGrossSalary() {
		return this.grossSalary;
	}
	public void setGrossSalary(double grossSalary) {
		this.grossSalary = grossSalary;
	}
	public double getTax() {
		return this.tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	public double netSalary() {
		return grossSalary - tax;
	}
	public void increaseSalary(double perc) {
		grossSalary = (grossSalary + ((grossSalary * perc)/100));
	}
	public String toString() {
		return "Employee: " +name
				+"\nSalary: $ "+ String.format("%.2f",netSalary());
	}
	
}
