v
	class Notes {
			public static void main(String args[]) {
				
				//declaring a boolean
				boolean bool;

				//assigning to a boolean

				bool = true;
				System.out.println(bool);
				bool = false;
				System.out.println(bool);

				//create booleans by using comparison

				//range of comparators - >, <, >=, <=, ==, !=
				// >  greater than
				// <  less than
				// <=  less than or equal to
				// >=  greater than or equal to
				// ==  equal to
				// !=  not equals to

				System.out.println(5 < 6);

				int num;
				num = 5;
				System.out.println(num < 6);

				System.out.println(3 + 4 < 2 * 5); //7 < 10

				//these comparator are used only for primitive types (char, int, double, boolean)
				//primitive data type cannot be broken down into a smaller data type
				//a non-primtive can be broken down into another data type (Strings)

				//var.equals(value)

				String word;
				word = "hello";
				System.out.println(word.equals("Hello")); //strings must be identical to get true

				//var.compareTo(value)

				System.out.println(word.compareTo("Zebra") < 0);  //before
				System.out.println(word.compareTo("alpha") > 0);  //after
				System.out.println(word.compareTo("hello") == 0);  //same
				//negative number - variables is earlier than the value in the alphabet
				//0 - variable is the same as the value
				//positive number - variable is later than the value in the alphabet 
			}
	}