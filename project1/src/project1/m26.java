package project1;

import java.util.Scanner;
public class m26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int g= 10;
int m = 20;
int h = m % g;
System.out.println(h);

System.out.println("hello world");

Scanner input = new Scanner (System.in);
System.out.println("enter the value for A");
int a = input.nextInt();
System.out.println("enter the value for b");
int b = input.nextInt();
System.out.println("result is");
int c = a * b - b;	
System.out.println(c);

System.out.println("enter the value for Ar");
float ar = input.nextFloat();
System.out.println("enter the value for br");
float br = input.nextFloat();
double hr = 3.14 * ar + br;
System.out.println( "value is " + hr);

System.out.println("enter the your name");
String name = input.nextLine();


System.out.println("enter the your age");
String Age = input.nextLine();

System.out.println("my name is " + name);
System.out.println("my age is " + Age);

	}

}