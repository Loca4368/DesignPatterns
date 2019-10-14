package com.designpattern.structuralpatterns.adapter;

/*
 * Client
 */
public class AdapterPatternClient {

	public static void main(String[] args) {

		CreditCard creditCardInterfaceCard = new BankCustomer();
		creditCardInterfaceCard.getBankDetails();
		System.out.println(creditCardInterfaceCard.getCreditCard());
	}
}