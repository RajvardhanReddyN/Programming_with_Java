
//Calculating SI by User Input

import java.util.Scanner;

 class SI

{
	public static void main(String[] args) 
	
	{
	    int p,t;
	    double r, SI;
	    Scanner obj = new Scanner(System.in);
	    System.out.println("Enter the Amount: ");
	    p=obj.nextInt();
	    System.out.println("Enter the Time: ");
	    t=obj.nextInt();
	    System.out.println("Enter the Rate: ");
	    r=obj.nextDouble();
	    
	    SI=p*t*r/100;
	    
	    System.out.println("Simple Intrest : " + SI);
	    
	}
}