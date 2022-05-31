package com.assignmentArray;
import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
	
		public static String reversString(int[] input) {
			String reversString = "";
			for(int i=input.length-1; i>=0; i--) {
				reversString += input[i]+" ";
			}
			return reversString;
		}
	
	
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			System.out.println("Enter the length of Array");
			int arrLength = input.nextInt();
			System.out.println("Enter your array");
			int[] arr = new int[arrLength];
			
			for(int i=0; i<arrLength; i++) {
				arr[i] = input.nextInt();		
			}
			System.out.println(Arrays.toString(arr));	
			
			System.out.println("THe reversed arr :");
			System.out.println(reversString(arr));
			input.close();
		}
}
