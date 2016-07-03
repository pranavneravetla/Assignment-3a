
public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int limit=100;
		System.out.println("Prime Numbers from 1 to " +limit );
		int i;
		
		for(i =1;i < 100; i++)
		{
			boolean isprime = true;
			
					for(int j=2; j<i ; j++)
					
					{
			
										if(i%j==0)
										{
		isprime = false;
				break;
			}
		}
			if(isprime){
				System.out.print(i + " " );
			}
		}
	}
			
		
	}

