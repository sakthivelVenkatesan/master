package sa;

public class Switch {
	public static void main(String[]srgs) {
	 
		int course = 2; 
		int tech = 2; 
		
		 
		 switch(tech){ 
		case 1: 
		 System.out.println("python"); 
		 break; 
		case 2:
			System.out.println("sql");
			break;
		 case 3: 
		 switch(course){ 
		case 1: 
		 System.out.println("J2EE"); 
		 break; 
		 case 2: 
		 System.out.println("advance java"); 
		 } 
		 } 
	}
}