package sa;

public class Sorting {

	public static void main(String[] args) {
		{
			int num[]= {21,5,78,56,59,23,19};
			int n=num.length;
			System.out.println("the numbers to be sorting are:");
			 for(int i=0;i<n;i++) {
				 System.out.println(""+num[i]);
			 }
			 System.out.println("");
			 for(int i=0;i<n;i++)
			 {
				 for(int j=i+1;j<n;j++)
				 {
					 if(num[i]<num[j])
					 {
						 int temp=num[i];
						 num[i]=num[j];
						 num[j]=temp;
					 }
				 }
			 }
		System.out.println("the stored list is follows:");
		for(int i=0;i<n;i++)
		{
	System.out.println(""+num[i]);
	
		}
		System.out.println("");
	}
	}
}
			 
			 
					 
				 
			 
			 

	

