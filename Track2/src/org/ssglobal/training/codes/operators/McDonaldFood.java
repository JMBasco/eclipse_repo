package org.ssglobal.training.codes.operators;

import java.io.IOException;

public class McDonaldFood {

	public void showMenu() {
		do {
			System.out.println("[A] Burger");
			System.out.println("[B] Spaghetti");
			System.out.println("[C] French Fries");
			System.out.println("[D] Drinks");
			System.out.println("[F] Sundae");
			System.out.println("Enter your food option");
			
			try {
				char choice = (char) System.in.read();
				if (choice == 'e' || choice == 'E') {
					break;
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		} while(true);
	}
}
