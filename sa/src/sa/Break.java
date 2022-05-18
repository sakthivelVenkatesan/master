package sa;

public class Break {

	public static void main(String[] args) {

		a:{
			int i;
			for(int=0;i<10;i++) 
			{
				b:{System.out.println(i);;
				break b;
				//System.out.println(i);
				
				}
			}
		}
		for(int i=0;i<10;i++)
		{
			if(i%2==0)
			{
				continue;
			}
			System.out.println(i+":");
			}
		}
	}


