package com.designpattern.structuralpatterns.adapter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Apdater class
 */
public class BankCustomer extends BankAccount implements CreditCard {

	@Override
	public void getBankDetails() {
		try {
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

			System.out.println("======== Please enter your details ========");

			System.out.print("Card Number: ");
			long cardNumber = Long.parseLong(bufferedReader.readLine());
			System.out.print("\n");

			System.out.print("Card Holder Name: ");
			String cardHolderName = bufferedReader.readLine();
			System.out.print("\n");

			System.out.print("Bank Name: ");
			String bankName = bufferedReader.readLine();
			System.out.print("\n");

			this.setAccountNumber(cardNumber);
			this.setAccountHolderName(cardHolderName);
			this.setBankName(bankName);

		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Override
	public String getCreditCard() {

		long cardNumber = getAccountNumber();
		String cardHolderName = getAccountHolderName();
		String bankName = getBankName();

		return ("The Account number " + cardNumber + " of " + cardHolderName + " in " + bankName
				+ " bank is valid and authenticated for issuing the credit card. ");

	}
}