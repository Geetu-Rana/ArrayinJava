package com.array;

import java.util.Arrays;

public class Matrix {

	public static void main(String[] args) {
//		first way
		int[][] mat1 = {
				{1,5},
				{3,4,5}
		};
//		System.out.println(mat1);
		
		for(int i=0; i<mat1.length; i++) {
			for(int j=0; j<mat1[i].length; j++) {
				System.out.println(Arrays.toString(mat1[i]));
			}
		}
		
	}
	
	
	
}
