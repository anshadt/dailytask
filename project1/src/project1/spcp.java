package project1;

import java.util.Scanner;

public class spcp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter cost price");
		double cp = input.nextDouble();
		
		System.out.println("enter gst rate");
		double gstrate = input.nextDouble();
		
		
		System.out.println("enter selling price");
		double sp = input.nextDouble();
		
		
		double gstAmount = cp * gstrate;
		double netPrice  = cp + gstAmount;
		double profit    = sp - netPrice;
		double loss      = netPrice - sp;
		
		if(sp>netPrice)
		{
		System.out.println(" you have a of profit " + profit);	
	}
		else
		{
			System.out.println("you have a of loss " + loss);
		}
		}

}
