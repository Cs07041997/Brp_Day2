package com.bridgelabz.programDay2;

import java.util.Scanner;

public class IntOpt {
	
	public static void operater(int a, int b, int c) {
		int sum1,  sum2, sum3, sum4;
		sum1 = a + b * c;
		System.out.println("operation is"+sum1);
		sum2 = a * b + c;
		System.out.println("operation is"+sum2);
		sum3 =  c + a/b;
		System.out.println("operation is"+sum3);
		sum4 = a %b + c;
		System.out.println("operation is"+sum4);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a");
         int a = sc.nextInt();
         System.out.println("Enter the value of b");
         int b= sc.nextInt();
         System.out.println("Enter the value of c");
         int c= sc.nextInt();
         operater( a,  b,  c);
        
	}
}
