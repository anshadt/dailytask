package project1;

import java.util.Scanner;

public class switch3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);

		System.out.println("what is your proffession");
		
		String proffession = input.nextLine();
		
		switch (proffession)
		{
		case "CEO": System.out.println(" CEO is head of the organisation");
		break;
		
		case "manager": System.out.println("manager is the decision maker");
		break;
		
		case "team leader": System.out.println("team leader has the power of maintaining employee's");
		break;
		
		case "employee": System.out.println("employee is the person who deal with customer");
		break;
		
		default:
			System.out.println("please enter the valid proffession");
			break;
		}
	}

}
