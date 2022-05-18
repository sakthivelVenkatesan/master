package sa;

import java.util.Scanner;

public class Scan {


	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter your name:");
	String name=sc.nextLine();
	System.out.println("enter your name="+sc);
	
	System.out.println("enter two numbers");
	int first=sc.nextInt();
	int second=sc.nextInt();
	
	System.out.println(first+second);
	
	int  sum=first+second;
	
	System.out.println("result"+sum);
	
	
	
	if(first==second) {
		System.out.println("value equal");
	
	}
	
	else if(first>second) {
		System.out.println("value is not equal");
	}
	
	else {
		System.out.println("not");
	}
	
	
	
	System.out.println("enter value of ....a");
	int a=sc.nextInt();
	
	System.out.println("enter value of ...b");
	int b=sc.nextInt();
	
	
	int c=a*b;
	int d=a%b;
	int e=a/b;
	int j=a-b;
	
	System.out.println("result="+c);
	System.out.println("result="+d);
	System.out.println("result="+e);
	System.out.println("result="+j);
	
	}
	
	

}
