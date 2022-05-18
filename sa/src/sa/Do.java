package sa;

import java.util.Scanner;

public class Do {
       public static void main(String[] args) {
    	   //int x=1;
       
//    	  do { 
//    		System.out.println("value of x:"+x); 
//    		x--;
//    	 System.out.print("\n"); 
//       } while( x < 11 );
//       }
//       
// float a=5.5f;
    	   ////Scanner sc=new Scanner(System.in);
    	  // System.out.println("enter the floating value:=");
    	  // long a=sc.nextLong();
    	 
 //do {
	// System.out.println("value of a=:"+a);
	// a++;
//}	 while(a<=15.5);//
 
 //System.out.println("enter the b floating value=:");
// float b=sc.nextFloat();
 
// while(b<=20.1){
//	 System.out.println(" value of b=:"+b);
	// b++;
	 
// }//


 int number, sakthi=15;
 Scanner sc=new Scanner(System.in);
System.out.println("enter the integer value");

number=sc.nextInt();
 while(number<=59) {
	 sakthi = sakthi + number;
	 number++;
 }
 System.out.println("sum of numbers from loop is:%d"  + sakthi);
 
 
 int x=1;
 do {
	 System.out.println("value of x:="+x);
	 x++;
 }while(x<=50);
 
	
       }
}


    	  
    	  



    	  
    	  
    	  
    	  
    	  
    	  
//    	  public class DoWhileLoo { 
//    		  public static void main(String args[]) { 
//    		  int x = 1; 
//    		  
//    		  do { 
//    		  System.out.print("value of x : " + x ); 
//    		  x++; 
//    		  System.out.print("\n"); 
//    		  }while( x < 11 );