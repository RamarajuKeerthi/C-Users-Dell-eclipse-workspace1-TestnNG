package Automation;

public class Stringnamecount
{

	public static void main(String[] args)
	{
		String a ="Manikanta";
		int r='k';
		int count=0;
		for(int i=0;i<=a.length()-1;i++)
		{
			char s=a.charAt(i);
			if(s==r)
			{
				count++;
			}
		}
				System.out.println(count);
	}

}
