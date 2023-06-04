package project1;

import java.util.Scanner;

public class Diceswitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);

		System.out.println("what is rolling dice number");
		int dice = input.nextInt();
		switch(dice)
		{
		case 1:System.out.println("good to go");
		break;
		
		case 2:System.out.println("you have won a motor bike");
		break;
		
		case 3:System.out.println("you have 20% cash back on any grocery products");
		break;
		
		case 4:System.out.println("free ticket for wonderla");
		break;
		case 5:System.out.println(" you won a smart phone");
		break;
		case 6:System.out.println(" coffee with celebratiy");
		break;
		default:System.out.println("Better luck next time");
		}
		
	}

}
