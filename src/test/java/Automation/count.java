package Automation;

public class count 
{
	public static void main(String[] args)
	{
		String r ="java";//(stringreprasention
		char c='a';//Verbal
		int count=0;
		for(int i=0;i<=r.length()-1;i++)
		{
			char s =r.charAt(i);
			if(s==c) 
			{
				count++;
			}
		}
				System.out.println(count);

	}

}
