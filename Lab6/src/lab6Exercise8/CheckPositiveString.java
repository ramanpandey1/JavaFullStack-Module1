package lab6Exercise8;

public class CheckPositiveString {
	public  boolean isPositive(String input)
	{
		boolean ispositive=true;
		input=input.toLowerCase();
		char arr[]=input.toCharArray();
		
		for(int i=1;i<arr.length;i++)
		{
		  if(!(arr[i]>arr[i-1]))
		  {
			  ispositive=false;
		  }
		}
		
		return ispositive;
	}

}
