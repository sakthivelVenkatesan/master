package sa;

import java.util.Scanner;

public class Shiva {

	public static void main(String[] args) {
Scan in =new Scan(System.in);
System.out.println("enter the material status M/U");
char marital=in.next().charAt(0);
if(marital=='U' || marital=='u') {
	System.out.println("enter the gender M/F");
	char gender=in.next().charAt(0);
	System.out.println("enter your age");
	int age=in.nextInt();
	if((gender=='M' || gender=='m')&& age>=30) {
		System.out.println("you are eligible");
	}
	else if ((gender=='F' || gender=='F')&& age>=25) {
		System.out.println("you are eligible");
	}
	else
	{
		System.out.println("not elgible");
	}
	
}
}

}
