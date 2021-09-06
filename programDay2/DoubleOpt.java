package com.bridgelabz.programDay2;

import java.util.Scanner;

public class DoubleOpt {
	
	public static void operater(double a, double b, double c) {
		double sum1,  sum2, sum3, sum4;
		sum1 = a + b * c;
		System.out.println("operation is"+sum1);
		sum2 = a * b + c;
		System.out.println("operation is"+sum2);
		sum3 =  c + a/b;
		System.out.println("operation is"+sum3);
		sum4 = a % b + c;
		System.out.println("operation is"+sum4);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a");
		double a = sc.nextDouble();
         System.out.println("Enter the value of b");
         double b = sc.nextDouble();
         System.out.println("Enter the value of c");
         double c = sc.nextDouble();
         operater( a,  b,  c);

	}

}
