package ativPooExer5;

public class Bank {
	private String holderName;
	private int numbAccount;
	private double balance;
	
	public Bank(String holderName,int numbAccount) {
		this.holderName = holderName;
		this.numbAccount = numbAccount;
	}
	public Bank(String holderName,int numbAccount,double balance) {
		this.holderName = holderName;
		this.numbAccount = numbAccount;
		deposit(balance);
	}
	public String getHolderName() {
		return holderName;
	}
	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}
	public int getNumbAccount() {
		return numbAccount;
	}
	public double getBalance() {
		return balance;
	}
	public void deposit(double value) {
		this.balance =  this.balance + value;
	}
	public void drawOut(double value) {
		this.balance = this.balance - value - 5.0;
	}
	public String toString() {
		return "\n==================================================================\n"
				+"Account Data: \n"
				+"Account " + getNumbAccount()
				+" Holde " + getHolderName()
				+" Balance " + getBalance();
	}
}
