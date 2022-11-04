package Automation;

public class prstice2 
{

	public static void main(String[] args) 
	{
		String a="swamy";
		int totle=a.length()-1;
		char s='a';
		for(int i=0;i<=totle;i++)
		{
			char w = a.charAt(i);
		
			if(w==s) 
			{
				System.out.println(w);
			}
		}
	}

}
