package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	//1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		String arrayy [] = new String[] {"Bob","Steve", "John", "Jack"};
		MoreArrayFun fun = new MoreArrayFun();
		fun.array4(arrayy);
		}
	

	
	//2. Write a method that takes an array of Strings and prints all the Strings in the array.
	
		void array1(String[] array) {
			for (int i = 0; i < array.length; i++) {
				System.out.println(array[i]);
			}
		}
	
	
	//3. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in reverse order.
		void array2(String[] array) {
			for (int i = array.length; i > 0; i++) {
				System.out.println(array[i]);
			}
		}
	
	
	//4. Write a method that takes an array of Strings and prints every other String in the array.
		void array3(String[] array) {
			for (int i = 0; i < array.length; i+=2) {
				System.out.println(array[i]);
			}
		}
	
	//5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.
		void array4(String[] array) {
			String [] output = new String[array.length];
			Random r = new Random();
			for (int i = 0; i < output.length; i++) {
				int rand = r.nextInt(array.length);
				if(output[rand] != null) {
					i--;
				}
				else {
				output[rand] = array[i];
				}
			}
			for (int j = 0; j < output.length; j++) {
			
			System.out.println(output[j]);
			}
		}
	
}
