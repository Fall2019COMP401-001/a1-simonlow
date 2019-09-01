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
		
		double [] totals = new double[cust];
		
		for (int i = 0; i < cust; i++) {
			String first = scan.next();
			
			String last =scan.next();
			
			names[i] = first + " " + last;
			
			//gets number of types of items bought by this customer
			int it = scan.nextInt();
			
			for (int j = 0; j< it; j++) {
				//x = number of that item
				int x = scan.nextInt();
				
				//q = name of item
				String q = scan.next();
				totals[i] += getCost(x,q,items,prices);
				
			}
			
			
		}
		//for (int k = 0; k < totals.length; k++)
		//{
		//	System.out.println(totals[k]);
		//}
		
		String bigg = names[getBiggest(names,totals)];
		
		//System.out.println(bigg);
		
		String small = names[getSmallest(names,totals)];
		
		//System.out.println(small);
		
		double b1 = totals[getBiggest(names,totals)];
		
		//System.out.println(b1);
		
		double s1 = totals[getSmallest(names,totals)];
		
		//System.out.println(s1);
		
		String bigge = convertTwo(b1);
		//System.out.println(bigge);
	
		String smal = convertTwo(s1);
		//System.out.println(smal);
		
		
		double tot = 0;
		for (int i = 0; i<totals.length; i++)
		{
			tot+= totals[i];
			//System.out.println(tot);
		}
		double average = tot/(totals.length);
		
		String ave = convertTwo(average);
		
		System.out.println("Biggest: " + bigg + " (" + bigge + ")");
		System.out.println("Smallest: " + small + " (" + smal + ")");
		System.out.println("Average: " + ave);
		
	}
	static int getBiggest(String [] nam, double[] tems)
	{
		
		int big = 0; 
		for (int i = 1; i <tems.length;i++) {
			if (tems[i] > tems[big])
				big = i;
		}
		return big;
		
		
	}
	static int getSmallest(String [] nam, double[] tems)
	{
		
		int small = 0; 
		for (int i = 1; i <tems.length;i++) {
			if (tems[i] < tems[small])
				small = i;
		}
		return small;
		
		
	}
	static double getCost(int n, String s, String[] i, double[] p)
	{
		double cost = 0;
		
		for (int b = 0; b < i.length; b++) {
			if (s.contentEquals(i[b])) {
				cost = (double)n * p[b];
				break;
			}
		}
		return cost;
		
		
	}
	static String convertTwo(double x)
	{
		double b2 = x*100;
		int b3 = (int)Math.round(b2);
		
		String pri = Integer.toString(b3);
		String pric;
		
		if(pri.length() == 1) {
			pric = "0.0" + pri;
		}
		else if (pri.length() == 2) {
			pric = "0." + pri;
		}
		else if (pri.length() == 3 ) 
		{
			pric = pri.charAt(0) + "." + pri.substring(1,3);
		}
		else 
		{
			pric = pri.substring(0, pri.length() - 2) + "." 
		+ pri.substring(pri.length() - 2, pri.length());
		}
		
		
		return pric;
	}
}
