package com.primeNumber;

import java.util.Arrays;

public class PrimeNum {

	public int[] findAndReturnPrimeNumbers(int[] inputArray){
	
		int[] ansArr = new int[inputArray.length];
				int top = 0;
		for(int i=0; i<inputArray.length; ++i) {
			int count = 0;
			
			for(int j=1; j<=inputArray[i]; ++j) {
				
				if(inputArray[i]%j==0) {
					count++;
				}
			}
			if(count==2) {

				ansArr[top]=inputArray[i];
				top++;				
			}
		}
		return ansArr;
	}
	
	public static void main(String[] args) {
		PrimeNum primeNumber = new PrimeNum();
		
		int[] arr = {1,2,3,4,5,11,12,13};
		int[] ans = primeNumber.findAndReturnPrimeNumbers(arr);
		
		System.out.println(Arrays.toString(ans));

		
		
	}
}
