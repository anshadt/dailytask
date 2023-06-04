package project1;

import java.util.Scanner;
public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
System.out.println("enter the day");

String days = input.nextLine();

switch (days)
{
case "monday":System.out.println("monday is day one");
break;
case "tueseday":System.out.println("tueseday is day two");
break;
case "wedneseday":System.out.println("wedneseday is day third");
break;
case "thursday":System.out.println("thursday is 4th day");

default:System.out.println("enter valid day");
break;


}

	}
}
