package com.coderscampus.assignment2;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

				
			int x = 5; 
			int randomValue = new Random().nextInt(100);
			int luckyNumber = randomValue + 1;

			Scanner scanner = new Scanner(System.in);
				
			while (x >= 0) {
				System.out.println("Pick a number between 1 and 100");
				String userInput = scanner.nextLine();
				int guess = Integer.parseInt(userInput);
					
				if (guess == luckyNumber) {
					System.out.println("You win!");
					break;
				} else if (x==0) {
					System.out.println("You lose. The number to guess was: " + luckyNumber);
					break;
				}else if (guess < 1 || guess > 100) {
					System.out.println("Your guess is not between 1 and 100, please try again");
				} else if (guess < luckyNumber) {
					System.out.println("Pick a higher number");
					x--;
				} else if (guess > luckyNumber) {
					System.out.println("Pick a lower number");
					x--;
				}
			} 	scanner.close();
		}
	}