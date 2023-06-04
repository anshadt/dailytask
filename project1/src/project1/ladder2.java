package project1;

import java.util.Scanner;

public class ladder2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		if(a>b&&a>c)
		{
			System.out.println(" a is greater");
		}
		if(b>c&&b>a) 
		{
			System.out.println(" b is greater");
		}
		else
		{
			System.out.println(" c is greater");
	}

	}
}