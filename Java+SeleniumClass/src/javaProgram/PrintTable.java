package javaProgram;

import java.util.Scanner;

public class PrintTable {
	public static void main(String[] args) {
		int i,res;
		Scanner s=new Scanner(System.in); 
        System.out.print("Enter a no.: "); 
        int num=s.nextInt();  
		for(i=1;i<=10;i++) {
		res=num*i;
		System.out.println(num+" * " +i +" = "+ res +"\n");
		}
	}

}
