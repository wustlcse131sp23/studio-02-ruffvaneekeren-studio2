package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in); 


		System.out.println("What is the start amount?");
		double startAmount = in.nextDouble();
		System.out.println("What is the win chance?"); 
		double winChance = in.nextDouble();
		System.out.println("What is the win limit?");
		int winLimit = in.nextInt(); 
		System.out.println("What is the number of rounds?");
		int rounds = in.nextInt();
		int plays = 0;

		for(int i = 1; i <=rounds ; i++) {
			while(startAmount>0 && startAmount<winLimit) {
				if (Math.random()<winChance)
				{
					startAmount++;
					plays++;
				}
				else 
				{
					startAmount--;
					plays++;
				}
			}
			
			System.out.println(i);
			if (startAmount == 0)
			{
				System.out.println("The day was a ruin!");
			} 
			else
			{
				System.out.println("It was a successful day!");
			}
			System.out.println(plays);
			plays=0;
			startAmount=1;
		}
		
		

		//System.out.println(startAmount);
		//System.out.println(winChance);
		//System.out.println(winLimit); 

		
		}

	}


