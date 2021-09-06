package com.bridgelabz.programDay2;

public class Distance {

	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter the value of x ");
        int x = utility.getIntValue();
        System.out.println("Enter the value of y ");
        int y = utility.getIntValue();
        utility.distance(x, y);
	}

}
