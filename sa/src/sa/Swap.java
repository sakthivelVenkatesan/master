package sa;

public class Swap {

	public static void main(String[] args) {
		
		
	float first=2.50f;
	float second=3.50f;
	
	System.out.println("--before swap--");
	System.out.println("first_number=:"+first);
	System.out.println("second_number=:"+second);
	// value first is temporary value assign;
	
	float temporary=first;
	
	first=second;
	
	second= temporary;
	
	System.out.println("--after swaop--");
	System.out.println("first_numbes=:"+first);
	System.out.println("second_numbers=:"+second);
	
	
	}
	
	}


