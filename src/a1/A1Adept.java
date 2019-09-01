package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		//get number of items
		int num = scan.nextInt();
		
		String [] items = new String [num];
		double [] prices = new double [num];
		
		
		for (int i = 0; i < num; i++) {
			//name, then price
			items[i] = scan.next();
			
			prices[i] = scan.nextDouble();
		}
		
		//get number of customers
		int cust = scan.nextInt();
		
		
		String [] names = new String[cust];
		
		for (int i = 0; i < cust; i++) {
			String f = scan.next();
			names[i] = f + scan.next();
			
			int it = scan.nextInt();
			for (int j = 0; j< it; j++) {
				int x = scan.nextInt();
				
				String q = scan.next();
				prices[i] += getCost(x,q,items,prices);
				
			}
			
		}
		
		String bigg = getBiggest(names,prices);
		String small = getSmallest(names,prices);
		
		double tot = 0;
		for (int i = 0; i<prices.length;)
		{
			tot+= prices[i];
		}
		double average = tot/(prices.length);
		
		System.out.println("Biggest: " + bigg);
	}
	static String getBiggest(String [] nam, double[] tems)
	{
		
		int big = 0; 
		for (int i = 0; i <tems.length;i++) {
			if (tems[i] > big)
				big = i;
		}
		return nam[big];
		
		
	}
	static String getSmallest(String [] nam, double[] tems)
	{
		
		int small = 0; 
		for (int i = 1; i <tems.length;i++) {
			if (tems[i] < tems[small])
				small = i;
		}
		return nam[small];
		
		
	}
	
	
	
	static double getCost(int n, String s, String[] i, double[] p)
	{
		double cost = 0;
		
		for (int b = 0; b < i.length; b++) {
			if (s.contentEquals(i[b])) {
				cost = (double)n * p[b];
			}
		}
		return cost;
		
		
	}
}
