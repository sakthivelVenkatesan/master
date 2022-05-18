package sa;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter widthb the triangle:");
		double base=sc.nextDouble();
		System.out.println("enter the height of triangle:");
		double height=sc.nextDouble();
		
		double area=base* height/2;
		System.out.println("area of triangle is:"+area);
		
	}

}
