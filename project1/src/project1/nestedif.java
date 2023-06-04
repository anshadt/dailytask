package project1;

import java.util.Scanner;

public class nestedif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);

System.out.println("Enter the age of person");
int age =input.nextInt();

System.out.println("Enter the weight of person");
int weight =input.nextInt();

if(age>=18)
{
	if(weight>=55)
	{
		System.out.println("the person can donate blood");
	}

	else
	{
		System.out.println("the person cannot donate blood");
	}
}
else
{
	System.out.println("the person cannot donate blood");
}
	}

}
