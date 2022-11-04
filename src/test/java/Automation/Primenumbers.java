package Automation;

public class Primenumbers {

	public static void main(String[] args) 
	{
		for(int a=1;a<=100;a++)
		{
			int count=0;
			for(int i=1;i<=a;i++)
			{
				if(a%i==0)
				{
					count++;
				}
			}
			  if(count==2) 
			  {
				System.out.println(a+ " is a prime number");
			  }
			  else if(count==1)
			  {
				  System.out.println(a+ " is not a prime number nor composite"); 
			  }
			  else
			  {
				  System.out.println(a+ " is a composite number");
			  }
			
		}

	}

}
