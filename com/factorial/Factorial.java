package com.factorial;

public class Factorial {
	
	public static int fact(int num) {
		
		if(num==0 || num ==1) {
			return 1;
		}else {
			int sum =1;
			for(int i=1; i<=num; i++) {
				sum *= i;
			}
			return sum;
		}
		
	}
	
	
	public static void main(String[] args) {
	
		if(args.length==1) {
			int num = Integer.parseInt(args[0]);
			System.out.println(fact(num));
			}
	     else if(args.length ==2) {
			int num1 = Integer.parseInt(args[0]);
			int num2 = Integer.parseInt(args[1]);
			int factNum = Math.abs(num1-num2);
			
			System.out.println(fact(factNum));
		}else {
			System.out.println("Error");
		}
	
	}
}
