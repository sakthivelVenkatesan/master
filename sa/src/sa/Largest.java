package sa;

public class Largest {

	public static void main(String[] args) {
		double n1 = -5.5, n2 = 11.5,n3 = 13.5 ;
		
		if(n1>=n2 && n3>=n1 ) {
			System.out.println(n1 + "+ the largest number");
		}
		
		else if(n2>=n1 && n2>=n1) {
			System.out.println(n2 + "++ the largest number");
		}
		
		else {
			System.out.println(n3+"+++ is the largest number.");
		}

	}

}
