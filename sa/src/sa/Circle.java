package sa;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter the radius:");

double radius=sc.nextDouble();
 double area=Math.PI* (radius * radius);
 System.out.println("The area of circule is:"+area);
 double circumference=Math.PI * 2* radius;
 System.out.println("The circumference of the circle is:"+ circumference);
 
	}

}
