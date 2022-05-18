package sa;

import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value length");
		double length=sc.nextDouble();
		System.out.println(" enter the value of width");
		double width =sc.nextDouble();
		
		double area=length*width;
		System.out.println("area rectangle is:="+area);
	}

}
