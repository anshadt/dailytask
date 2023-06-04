package project1;

import java.util.Scanner;

public class logical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
System.out.println(a>b && b>c);		
System.out.println(a>b || b>c);

	}

}
