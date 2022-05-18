package sa;

import java.util.Scanner;

public class Odd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two numbers");
		int in=sc.nextInt();
		int se=sc.nextInt();
		
		int sum=in+se;
		
		System.out.println("result=:"+sum);
		
	if(sum%2==0) {
		System.out.println("even numbers");
	}
	
	else if(sum%5==0)
	{
		System.out.println("odd numbers");
	}
	
	else
	{
		System.out.println("no value for odd and even numbers");
	}
		
	}

}
