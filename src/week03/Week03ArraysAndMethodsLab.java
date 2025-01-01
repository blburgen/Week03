//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject: Arrays & Methods
// Java Week 03 Lab
//
package week03;

public class Week03ArraysAndMethodsLab {

	public static void main(String[] args) {
			
		//
		// Arrays:
		//
		
		// 1. Create an array with the following values 1, 5, 2, 8, 13, 6
		int[] tom = {1,5,2,8,13,6};
		
		// 2. Print out the first element in the array
		System.out.print("(2)");
		System.out.print(tom[0]);
		
		// 3. Print out the last element in the array without using the number 5
		System.out.println();
		System.out.print("(3)");
		System.out.print(tom[tom.length-1]);
		
		// 4. Print out the element in the array at position 6, what happens?
		//System.out.println(tom[6]); creates an error.
		
		// 5. Print out the element in the array at position -1, what happens?
		//System.out.println(tom[-1]); creates an error.
			
		// 6. Write a traditional for loop that prints out each element in the array
		System.out.println();
		System.out.print("(6)");
		for (int i = 0; i < tom.length; i++) {
			System.out.print(tom[i] + ",");
		}
			
		// 7. Write an enhanced for loop that prints out each element in the array
		System.out.println();
		System.out.print("(7)");
		for (int num : tom) {
			System.out.print(num + ",");
		}
		
		// 8. Create a new variable called sum, write a loop that adds 
		//			each element in the array to the sum
		System.out.println();
		System.out.print("(8)");
		int sum = 0;
		for (int num : tom) {
			sum += num;
		}
		System.out.print(sum);	
		// 9. Create a new variable called average and assign the average value of the array to it
		System.out.println();
		System.out.print("(9)");
		double sumPlus = sum;
		double average = sumPlus / tom.length;
		System.out.print(average);
		
		// 10. Write an enhanced for loop that prints out each number in the array 
		//			only if the number is odd
		System.out.println();
		System.out.print("(10)");
		for (int num : tom) {
			if (num%2 != 0) {
				System.out.print(num + ",");
			}
		}
		
		// 11. Create an array that contains the values "Sam", "Sally", "Thomas", and "Robert"
		System.out.println();
		System.out.print("(11)");
		String [] firstName = {"Sam", "Sally", "Thomas", "Robert"};
		for (String name : firstName) {
			System.out.print(name + ",");
		}
		// 12. Calculate the sum of all the letters in the new array
		System.out.println();
		System.out.print("(12)");
		int totalLetters = 0;
		for (String name :  firstName) {
			totalLetters += name.length();
		}
		System.out.print(totalLetters);

		//
		// Methods:
		//
		
		// 13. Write and test a method that takes a String name and prints out a greeting. 
		//			This method returns nothing.
		System.out.println();
		System.out.print("(13)");
		PrintGreetingName("Tom");
		
		// 14. Write and test a method that takes a String name and  
		//			returns a greeting.  Do not print in the method.
		System.out.println();
		System.out.print("(14)");
		System.out.print(ReturnGreetingName("Tom"));
		
		// Compare method 13 and method 14:  
		//		a. Analyze the difference between these two methods.
		//		b. What do you find? 
		//		c. How are they different?
		
		// 15. Write and test a method that takes a String and an int and 
		//			returns true if the number of letters in the string is greater than the int
		System.out.println();
		System.out.print("(15)");
		System.out.print(IsStringLong("Priority", 5));
		System.out.print("," + IsStringLong("End", 3));
		
		// 16. Write and test a method that takes an array of string and a string and 
		//			returns true if the string passed in exists in the array
		System.out.println();
		System.out.print("(16)");
		String [] testArray = {"Tom", "Jill", "Jan", "nothing"};
		String testString = "Jan";
		System.out.print(IsStringInArray(testArray,testString) + "," + IsStringInArray(testArray, "not"));
		
		// 17. Write and test a method that takes an array of int and 
		//			returns the smallest number in the array
		System.out.println();
		System.out.print("(17)");
		int[] numArray= {20,10,2,5,34,-20};
		System.out.print(SmallestNumber(numArray));
		
		// 18. Write and test a method that takes an array of double and 
		//			returns the average
		System.out.println();
		System.out.print("(18)");
		double[] DoubleArray = {2,4,7,1,3,6,3.0,2,.3};
		System.out.print(AverageNum(DoubleArray));

		// 19. Write and test a method that takes an array of Strings and 
		//			returns an array of int where each element
		//			matches the length of the string at that position
		System.out.println();
		System.out.print("(19)");
		String[] testStringArray = {"tom", "betty", "sex", "whyOhWhy"};
		int[] stringLengthArray = LengthOfString(testStringArray);
		for (int num : stringLengthArray) {
			System.out.print(num + ",");
		};
				
		// 20. Write and test a method that takes an array of strings and 
		//			returns true if the sum of letters for all strings with an even amount of letters
		//			is greater than the sum of those with an odd amount of letters.
		System.out.println();
		System.out.print("(20)");
		String[] testWordArray = {"Tom", "Sammantha", "Odds", "Cats", "decide"};
		System.out.print("There are more even length words than odd length words: " + IsEvenWordsGreaterThanOddWords(testWordArray));
	
		// 21. Write and test a method that takes a string and 
		//			returns true if the string is a palindrome
		System.out.println();
		System.out.print("(21)");
		String testWord = "racecar";
		System.out.print(testWord + " is a palindrome: " + IsWordAPalindrome(testWord));
		
		
	}

	
	// Method 13:
	private static void PrintGreetingName(String name) {
		System.out.print("Hi " + name + ".");
		
	}

	// Method 14:
	private static String ReturnGreetingName(String name) {
		String greeting = "Hi " + name + ".";
		return greeting;
	}
	
	// Method 15:
	private static boolean IsStringLong(String name, int num) {
		if (num < name.length()) {
			return true;
		} else {		
			return false;
		}
	}
	
	// Method 16:
	private static boolean IsStringInArray(String[] testArray, String testString) {
		for (String name : testArray) {
			if (name.contentEquals(testString)) {
				return true;
			}
		}
		return false;
	}

	
	// Method 17:
	private static int SmallestNumber(int[] numArray) {
		int smallest = numArray[0];
		for (int num : numArray) {
			if (num < smallest) {
				smallest = num;
			}
		}
		return smallest;
	}
	
	// Method 18:
	private static double AverageNum(double[] doubleArray) {
		double totalNumber = 0.0;
		for (double num : doubleArray) {
			totalNumber += num;
		}
		return totalNumber / doubleArray.length;
	}

	// Method 19:
	private static int[] LengthOfString(String[] testStringArray) {
		int[] intArray = new int[testStringArray.length];
		for (int i=0; i < testStringArray.length; i++) {
			intArray[i] = testStringArray[i].length();
		};
		return intArray;
	}

	
	// Method 20:
	private static boolean IsEvenWordsGreaterThanOddWords(String[] testWordArray) {
		int counter = 0;
		for (String word : testWordArray) {
			if (word.length()%2 != 0) {
				counter--;
			} else {
				counter++;
			}
		};
		if (counter > 0 ) {
			return true;
		}
		return false;
	}

	
	// Method 21:
	private static boolean IsWordAPalindrome(String testWord) {
		char front;
		char back;
		for (int i=0; i < testWord.length(); i++) {
			front = testWord.charAt(i);
			back = testWord.charAt(testWord.length()-1-i);
			if(front != back) {
				return false;
			}
		}
		return true;
	}



	

}
