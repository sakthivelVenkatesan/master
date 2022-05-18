
package sa;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
int number, sum=0;
Scanner sc=new Scanner(System.in);
int in=sc.nextInt();

while(in<=10) {
	sum=sum+in;
	in++;
}

System.out.format("sum of numbers while loop is: %d ",sum);

int num=sc.nextInt();
int obi,oo=1;
while(num<=5) {
  oo=oo+num;
	num++;
}

System.out.format("sum of numbers while loop is :% d",oo);

	}

}
