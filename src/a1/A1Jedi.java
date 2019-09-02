package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		//get number of items
				int num = scan.nextInt();
				
				String [] items = new String [num];
				double [] prices = new double [num];
				int [] custBought = new int[num];
				int [] numBought = new int[num];
				
				for (int i = 0; i < num; i++) {
					//name, then price
					items[i] = scan.next();
					
					prices[i] = scan.nextDouble();
				}
				
				//get number of customers
				int cust = scan.nextInt();
				
				
				
				String [] names = new String[cust];
				
				
				for (int i = 0; i < cust; i++) {
					String first = scan.next();
					
					String last =scan.next();
					
					names[i] = first + " " + last;
					
					//gets number of types of items bought by this customer
					int it = scan.nextInt();
					
					int [] listOfI = new int [it];
				
					for (int j = 0; j< it; j++) {
						//x = number of that item
						int x = scan.nextInt();
						
						//q = name of item
						String q = scan.next();
						
						int u = getIndex(q, items, num);
						listOfI[j] = u;
						
						numBought[u]+= x;
						
						
						
						
					}
					for (int f = 0; f<items.length;f++) 
					{
						for ( int w = 0; w < it; w++)
						{
							if (listOfI[w]==f)
							{
								custBought[f]++;
								break;
							}
								
						}
					}
					
				}
				
				
			for (int l = 0; l<num; l++)
			{
				if (custBought[l] == 0) {
					System.out.println("No customers bought " + items[l]);
				}
				else {
					System.out.println(custBought[l] + " customers bought " 
				+ numBought[l] + " " + items[l]);
				}
				
			}
				
		
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
	static int getIndex(String item, String [] items, int num)
	{
		for (int i = 0; i < num; i++)
		{
			if( item.equals(items[i]) )
				return i;
		}
		return 0;
	}

}
