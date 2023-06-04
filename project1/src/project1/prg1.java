package project1;

import java.util.Scanner;

public class prg1 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("enter the value of radius");
		float r = input.nextFloat();
		double area = 3.14 * r * r;
		System.out.println("the area is" + area);

	}

}
