import java.lang.*;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		int[] intArray = new int[7];
		intArray[0] = 20;
		intArray[1] = 35;
		intArray[2] = -15;
		intArray[3] = 7;
		intArray[4] = 55;
		intArray[5] = 1;
		intArray[6] = -22;
		
		//prints out all values of the array given the index O(1)
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
		
		//prints out the index value of 7 which is O(n) linear time complexity
		int indexOfValue = -1;
		for (int i = 0; i < intArray.length; i++) {
			if (intArray[i]==7) {
				indexOfValue = i;
				break;
			}
			
		}
		System.out.println("index of 7 is "+ indexOfValue);
		
		//write code to add element to the end of an array (with space)
		int[] intArray2 = new int[5];
		for(int i = 0; i < intArray2.length; i++) {
			System.out.println(intArray2[i]);
		}
		intArray2[intArray2.length-1] = 5;
		for(int i = 0; i < intArray2.length; i++) {
			System.out.println(intArray2[i]);
		}
		
		//write code to add element to full array
		int[] intArray3 = new int[4];
		intArray3[0] = 1;
		intArray3[1] = 2;
		intArray3[2] = 3;
		intArray3[3] = 4;
		
		int x = 5;
		int[] newArray = new int[intArray3.length + 1];
		for (int i = 0; i < intArray3.length;i++) {
			newArray[i] = intArray3[i];
		}
		newArray[newArray.length-1] = x;
		intArray3 = newArray;
		System.out.println(Arrays.toString(intArray3));
		
		//write code to insert of update at a specific index
		
		// write code to delete an element by setting it to null
		
		// write code to delete element by shifting elements
		//this code will delete element[0] of intArray3
		for (int i = 0; i < intArray3.length-1; i++) {
			intArray3[i] = intArray3[i+1];
		}
		intArray3[intArray3.length-1] = 0;
		System.out.println(Arrays.toString(intArray3));
	}

}