package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		//enter number of custoemrs
		int c = scan.nextInt();
		
		String[] fnames = new String[c];
		String[] lnames = new String[c];
		double [] prices = new double[c]; 
		
		
		
		for (int i = 0; i< c; i++)
		{
			//Enter first name, last name, and how many types of items
			fnames[i] = scan.next();
			lnames[i] = scan.next();
			int num = scan.nextInt();
			
			for (int j = 0; j< num; j++)
			{
				//enter number of that item, name, and price
				int n = scan.nextInt();
				
				String item = scan.next();
				
				double p = scan.nextDouble();
				
				prices[i]+= (p*(double)n);
						
			}
				
		}
		
		for (int i = 0; i < c; i++)
		{
			System.out.println( fnames[i].charAt(0) + ". " + lnames[i] 
			+ " " + prices[i]);
		}
		
		
		
	}
}
