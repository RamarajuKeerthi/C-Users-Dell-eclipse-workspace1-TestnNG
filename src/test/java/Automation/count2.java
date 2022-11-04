package Automation;

public class count2 
{

	public static void main(String[] args)
	{
		String a="maniswami";
		int totle=a.length()-1;
		char r='a';
		int count=0;
		for(int i=0;i<=totle;i++)
		{
			char s= a.charAt(i);
			if(s==r)
			{
				count++;
			}
		}
				System.out.println(count);
	}

}
