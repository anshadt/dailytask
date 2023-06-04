package project1;

import java.util.Scanner;

public class gst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("enter the price of shirt");
         double shirt = input.nextDouble();
         
         System.out.println("enter the price of jeans");
         double jeans = input.nextDouble();
         
         System.out.println("enter the price of jacket");
         double jacket = input.nextDouble();
         
         System.out.println("enter the price of cap");
         double cap = input.nextDouble();
         
		System.out.println("enter gst rate");
	    double gstrate = input.nextDouble();
		
	    double gstAmount = shirt * gstrate;
	    double gstAmount1 = jeans * gstrate;
	    double gstAmount2 = jacket * gstrate;
	    double gstAmount3 = cap * gstrate;
	    
	    System.out.println(" gst amount of shirt is " + gstAmount);
	    System.out.println(" gst amount of jeans is " + gstAmount1);
	    System.out.println(" gst amount of jacket is " + gstAmount2);
	    System.out.println(" gst amount of cap is " + gstAmount3);
		
	}

}
