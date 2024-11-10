package com.coderscampus.assignment2;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Instantiate all variables
		boolean hasRightGuess = false;
		int guesses = 1; 
		int maxNumberOfGuesses = 5;
		int userGuess;
		int luckyNumber = new Random().nextInt(100) + 1;
		Scanner scanner = new Scanner(System.in);
			
		// Un-comment line below to view the number to guess
		// System.out.println("The lucky number is: " + luckyNumber);
		System.out.println("Pick a number between 1 and 100");
			
		// Logic
		while (guesses <= maxNumberOfGuesses) {				
			userGuess = Integer.parseInt(scanner.nextLine());				
			if (userGuess < 1 || userGuess > 100) {
				System.out.println("Your guess is not between 1 and 100, please try again");
			} else if (userGuess == luckyNumber) {
				hasRightGuess = true;
				System.out.println("You win!");
				break;	
			} else if (guesses == 5) {
				break;
			} else if (userGuess < luckyNumber) {
				System.out.println("Pick a higher number");
				guesses++;
			} else {
				System.out.println("Pick a lower number");
				guesses++;
			}
		}
		if (guesses == 5 && hasRightGuess == false) {
			System.out.println("You lose. The number to guess was: " + luckyNumber);
		}
		scanner.close();
	}
}