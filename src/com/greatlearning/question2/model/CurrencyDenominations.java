package com.greatlearning.question2.model;

public class CurrencyDenominations {
	
	public int[] currency_denominations=null;
	public int amount_payable;
	
	
	public CurrencyDenominations(int[] currency_denominations, int amount_payable) {
		this.currency_denominations = currency_denominations;
		this.amount_payable = amount_payable;
	}
	
	public int[] getCurrency_denominations() {
		return currency_denominations;
	}
	public void setCurrency_denominations(int[] currency_denominations) {
		this.currency_denominations = currency_denominations;
//		for(int i=0;i<3;i++) {
//			System.out.println(currency_denominations[i]);
//		}
	}
	public int getAmount_payable() {
		return amount_payable;
	}
	public void setAmount_payable(int amount_payable) {
		this.amount_payable = amount_payable;
	}
	
	
	

}
