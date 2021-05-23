package javaProgram;

import java.util.Scanner;

public class PrimeNo {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in); 
        System.out.print("Enter your no.: ");  
        int num=s.nextInt();  
		int rem=0;
		for(int i=2;i<=num;i++)
		{
			if(num%i==0)
			{
				rem++;
			}			
		}
		if(rem>1)
		{
			System.out.println("Given no. is not prime");
		}
		else
		{
			System.out.println("Given no. is prime");
		}
	}
}
	
	
