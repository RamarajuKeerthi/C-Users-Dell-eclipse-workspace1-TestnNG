package Automation;

public class bignumberinarray
{
	public static void main(String[] args)
	{
		int a[]= {1,2,3,4,5,};
		//int count=a.length-1;
		int max=a[0];
		for(int i=0;i<=a.length-1;i++)
		{
			if(max<=a[i])
			{
				max=a[i];
			}
		}
				System.out.print(max);
	}
}
