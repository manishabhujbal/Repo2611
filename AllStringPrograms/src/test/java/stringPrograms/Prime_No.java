package stringPrograms;

public class Prime_No {
	
	public static void main(String args[])
	{
		int n=4,i;
		for( i=2;i<=n;i++)
		{
			if(n%i==0)
			{
				break;
			}
		}
		if(n==i)
		{
			System.out.println("prime");
		}
		else
		{
			System.out.println("not prime");
			
		}
			
	}
	

}
