package sa;

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		for(int i=1; i<=5;i++) {
			for(int j=1;j<=i;j++) {
				
				System.out.print("* ");
			}
		System.out.println();//newline
		}
		
		int term=6;
		for(int i=1;i<=term;i++) {
			for(int j=term;j>=i;j--) {
				System.out.println("* ");
				
			}
			System.out.println();//new line
		}
		int rows, number=1,counter,j;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the no.of rows floyed triangle:");
		rows=input.nextInt();
		System.out.println("Floyed's triangle");
		System.out.println("**************");
		for(counter=1;counter <= rows;counter++){
	for(j=1;j<=counter;j++) {
		System.out.println(number+" ");
		number++;
	}
	// for new line
	System.out.println();
	}
	
}
		

	}


