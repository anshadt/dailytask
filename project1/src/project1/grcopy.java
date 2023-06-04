package project1;

import java.util.Scanner;

public class grcopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println(" enter students marks");
		int marks = input.nextInt();
		
		 if(marks>=91 && marks<=100)
		{
			System.out.println("A+");
		}
		 if(marks>=81 && marks<=90)
		{
			System.out.println("A");
		}
		 if(marks>=71 && marks<=80)
		{
			System.out.println("b+");
		}
		  if(marks>=61 && marks<=70)
		{
			System.out.println("b");
		}
		  if(marks>=51 && marks<=60)
		{
			System.out.println("c+");
		}
		else
		{
			System.out.println("improve");
		}
	}

}

