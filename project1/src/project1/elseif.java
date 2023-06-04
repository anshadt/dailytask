package project1;
import java.util.Scanner;

public class elseif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		System.out.println(" enter ctc");
		double ctc = input.nextDouble();
		
		System.out.println(" enter hra percentage");
		double hraPer = input.nextDouble();
		if(ctc>= 10000 &&  ctc<=20000)
		{
			double da = 1000;
			double totalSal= ctc * hraPer;
			double totalamt= ctc + totalSal + da;
			System.out.println(totalamt);	
		}
		else if(ctc > 20000 && ctc<=30000)
		{
			double da2 = 2000;
			double totalSal= ctc * hraPer;
			double totalamt= ctc + totalSal + da2;
			System.out.println(totalamt);	
		}
		else
		{
			double da3 = 3000;
			double totalSal= ctc * hraPer;
			double totalamt= ctc + totalSal + da3;
			System.out.println(totalamt);
		}
	}

}
