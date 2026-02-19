/**
	* File: Lesson 1.6 - Booleans
	* Author: Mr. Kalisz
	*	Date Created: February 13, 2023
	* Date Last Modified: February 13, 2023
	*/

class Notes {
		public static void main(String args[]) {
			//declaring a boolean

			boolean bool;

			//Initialize the value -> assign to it

			bool = true; //notice that casing matters.  Booleans must start with lower case letters in Java
			System.out.println(bool);
			bool = false;
			System.out.println(bool);

			//booleans can actually be created a large variety of ways
			//their job is to tell if something was true or false (yes or no)

			//comparisons

			int num;
			num = 6;

			System.out.println(num < 5); //comparison becomes a boolean depending on the result of whether or not the comparison is correct(true) or incorrect(false)

			//range of comparators - >, <, >=, <=, ==, !=
			// >  greater than
			// <  less than
			// <=  less than or equal to
			// >=  greater than or equal to
			// ==  equal to
			// !=  not equals to

			//Each is resolved before the comparison takes place
			System.out.println(3 + 4 < 2 * 5);
			//System.out.println(7 < 10);

			//these comparators are used when dealing with primitive types (char, int, double, boolean)

			//for non primitives we have two other comparators to use

			//var.equals(value)

			String word;
			word = "hello";
			System.out.println(word.equals("bye"));

			//var.compareTo(value)

			System.out.println(word.compareTo("zebra"));
			System.out.println(word.compareTo("zebra") > 0);
			//negative number - variables is earlier than the value in the alphabet
			//0 - variable is the same as the value
			//positive number - variable is later than the value in the alphabet 
			
		}
}