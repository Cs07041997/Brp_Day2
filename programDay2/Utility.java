package com.bridgelabz.programDay2;

import java.util.Scanner;

public class Utility {
       Scanner sc;
       public Utility() {
   		sc = new Scanner (System.in);
       }
       
   	 public int getIntValue() {
     	return sc.nextInt();	
     }
   	 
   	 public void distance(int x, int y) {
   		 double dist;
   		 dist = Math.sqrt(x*x+y*y);
   		 System.out.println("distance is " +dist);
   	 }
   	 
   	 public void sumOfTwoDice() {
   		 double num1, num2;
   		 double sum;
   		num1= Math.floor((Math.random()*10)+1);
   		System.out.println("random number is "+num1);
   		num2= Math.floor((Math.random()*10)+1);
   		System.out.println("random number is "+num2);
   		sum = num1 + num2;
   		System.out.println("Random number is "+sum);
   	 }
}
