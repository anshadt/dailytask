package project1;

import java.util.Scanner;

public class pr2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter the value for base");
		int base = input.nextInt();
		
		System.out.println("enter the value for height");
		int height = input.nextInt();
		
		double Area;
		
		Area = 0.5*(base*height);
		
		System.out.println("the area of triangle is "+Area);

}

}
