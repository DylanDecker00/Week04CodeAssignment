package week04CA;

import java.util.Arrays;

public class Week04CodingAssignmentClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(multWord("Hello", 3));
		System.out.println("Above is the result for the return of a string int number of times question.");
		
		
		
///////////////	///////////////////BELOW I had to navigate an int array subtracting 2 elements from each other and add a new element to that array
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93} ;
		int n = ages.length;
		int lastNum = ages[n-1];
		int firstNum = ages[0];
		System.out.println(lastNum - firstNum);
		int newAgeArray[] = new int[n + 1];
		int addedAge = 18;
		System.out.println(Arrays.toString(ages));
		for (int i = 0; i < n; i++) {
			newAgeArray[i] = ages[i];
		}
		newAgeArray[n] = addedAge;
		System.out.println(Arrays.toString(newAgeArray));
	
		
/////////////////////Part 2 i had to create an array of names and find the average number of char in each String and add each word together printed to the system.
		
		String[] names = new String[6];
		names[0] = "Sam";
		names[1] = "Tommy";
		names[2] = "Tim";
		names[3] = "Sally";
		names[4] = "Buck";
		names[5] = "Bob";
		
		double sum = 0;
		for(int i = 0; i < names.length; i++) {
			sum += names[i].length();
			
			
		}
		
		double average = sum / names.length;
		System.out.println("The average number is " + average);
		
		
		
		String allNames = "";
		for(int j = 0; j < names.length; j++) {
			allNames += names[j] + " ";
			
		}
		System.out.println(allNames);
		
//////////////////////////Accessing the last element of the array using  variable[variable.length-1] 
		 System.out.println("Last element of an array is " + names[names.length-1]);
		 
		//Accessing the first element
		 
		 System.out.println("First element is " + names[0]);
		 
//////////////////////////////////////////////////////
		 
		int[] namesLength = new int[names.length];
		for (int i = 0; i < names.length; i++) {
			namesLength[i] = names[i].length();
		}
		
		int sum2 = 0;
		for (int i = 0; i < namesLength.length; i++) {
			sum2 = namesLength[i];
		}
		System.out.println("The sum of all the lengths in namesLength Array is " + sum2);
		
	}
	///////////////////////////
	
		public static String multWord(String word, int num) {
			String result = "";
			for(int i = 0; i < num; i++) {
				result += word;
			
			}
			return result;
		}
//////////////////////////////
		public static String fullName(String firstName, String lastName) {
			return firstName + " " + lastName;
			
				}
		 
//////////////////////////////

			public static Boolean sumGreaterThan100(int[] numbers) {
				return Arrays.stream(numbers).sum() > 100;
			}
		
///////////////////////////////////////////////////			
			public static double averageEl(double[] numbers) {
				double sum = 0;
				for(double number : numbers) {
					sum += number;
				
				}
				return sum / numbers.length;
			}
			


			
	///////////////////// OR 
			
			
			public static double averageDoubleArray(double[] numbers) {
				return Arrays.stream(numbers).average().orElse(Double.NaN);
			}
		
			public static boolean isGreaterThan(double [] firstListNum, double[] secondListNum) {
				return averageDoubleArray(firstListNum) > averageDoubleArray(secondListNum);
				
				
			}
	///////////////////////////////////////////////		/
			public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
				if(isHotOutside = true && moneyInPocket > 10.50) {
					
				}
				return isHotOutside(true);
			
			}
			private static boolean isHotOutside(boolean b) {
				
				return false;
			}
			
	////////////////////////////////////////////// I wrote 2 answers for the last question for PRACTICE 
			private static int sumArr(int[] listsOfStuff) {
				int sum = 0;
				for (int x : listsOfStuff) {
					sum += x;
				}
				return sum;
				}
		
		
		private static double calAverage(double[] numbers) {
			double sum = 0;
			for (double num:numbers) {
				sum += num;
			}
			return sum / numbers.length;
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
	
}
			
		
		
			

	
		
		
	
		
		


		


