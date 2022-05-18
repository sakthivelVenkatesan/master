package sa;

import java.util.Scanner;

public class UserArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] array=new int[10];
		int sakthi=0;
		System.out.println("enter the ellements:");
		for (int i=0;i<10; i++)
		{
			array[i]=sc.nextInt();
		}
		for(int num:array) {
			sakthi=sakthi+num;
		}
		System.out.println("sum  of array elements is :"+sakthi);
		
		
	}

}
