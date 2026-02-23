	/**
		* File: Lesson 1.6 - Booleans
		* Author: Visaagan Gunabalachandran
		* Date Created: February 13, 2023
		* Date Last Modified: February 20, 2026
		*/

import java.util.Scanner;
public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
	}

	public static void q1() {
		//Write question 1 code here
		Scanner input = new Scanner(System.in);
		boolean bool;
		bool = true;
		System.out.print("Input a boolean: ");
		bool = input.nextBoolean();
		System.out.println(bool);
		input.close();
	}

	public static void q2() {
		//Write question 2 code here
		Scanner input = new Scanner(System.in);
		int num;
		num = 0;
		System.out.print("Input an integer: ");
		num = input.nextInt();
		System.out.println(num > 5);
		input.close();
	}

	public static void q3() {
		//Write question 3 code here
		Scanner input = new Scanner(System.in);
		String word;
		word = "pizza";
		System.out.print("Input pizza: ");
		word = input.nextLine();
		System.out.println(word.equals("pizza"));
		input.close();
	}

	public static void q4() {
		//Write question 4 code here
		Scanner input = new Scanner(System.in);
		System.out.print("Input a number: ");
		double num = input.nextDouble();
		boolean result = (num == 0);
		System.out.println(result);
	}

	public static void q5() {
		//Write question 5 code here
		Scanner input = new Scanner(System.in);
		boolean bool;
		System.out.print("Input an integer: ");
		int num = input.nextInt();
		bool = num != 0;
		System.out.println(bool);
		input.close();
	}

	public static void q6() {
		//Write question 6 code here
		Scanner input = new Scanner(System.in);
		String word;
		System.out.print("Input a word earlier than google: ");
		word = input.nextLine();
		boolean result = word.compareTo("google") < 0;
		System.out.println(result);
		input.close();		
}
}
