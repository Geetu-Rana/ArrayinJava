package com.EvenSum;

public class EvenSum {
	public static void main(String[] args) {
		int[][] mat = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};

	for(int i=0; i<mat.length; ++i) {
		int sum =0;
		for(int j=0; j<mat.length; ++j) {
			if(mat[j][i] % 2==0)
				sum +=mat[j][i];
		}
		System.out.println(sum);
	}	
	}

}

