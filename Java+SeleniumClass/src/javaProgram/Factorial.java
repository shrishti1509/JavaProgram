package javaProgram;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {   //5= 5*4*3*2*1
		int i,fact=1;
		Scanner s=new Scanner(System.in); 
        System.out.print("Enter a no.: "); 
        int num=s.nextInt();  
		for(i=1;i<=num;i++)
		{
		fact=fact*i;
		}
		System.out.println("Factorial of no. is "+fact);
	}
}
