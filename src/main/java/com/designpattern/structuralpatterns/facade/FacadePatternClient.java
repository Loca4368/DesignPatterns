package com.designpattern.structuralpatterns.facade;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FacadePatternClient {

	private static int choice;

	public static void main(String[] args) throws NumberFormatException, IOException {

		MobileShop mobileShop = new MobileShop();
		do {
			System.out.println("========= Mobile Shop =========");
			System.out.print("            1. IPHONE.              \n");
			System.out.print("            2. HUAWEI.              \n");
			System.out.print("            3. NOKIA.            \n");
			System.out.print("            4. Exit.                     \n");
			System.out.print("Enter your choice: ");

			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
			choice = Integer.parseInt(bufferedReader.readLine());

			switch (choice) {
			case 1: {
				mobileShop.getIphone();
			}
				break;
			case 2: {
				mobileShop.getHuawei();
			}
				break;
			case 3: {
				mobileShop.getNokia();
			}
				break;
			default: {
				System.out.println("Nothing You purchased");
			}
			}

		} while (choice != 4);
	}
}