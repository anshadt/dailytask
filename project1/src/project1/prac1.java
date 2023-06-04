package project1;

import java.util.Scanner;
public class prac1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
System.out.println("enter the value for g");
int g = input.nextInt();
System.out.println("enter the value for p");
int p = input.nextInt();
int a = g * g - p;
System.out.println("area of square is " + a);
	}

}

