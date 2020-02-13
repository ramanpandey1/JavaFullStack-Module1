package lab6exercise5;

public class DifferenceOfNumber {

	public void modifyNumber(String input) {
		// TODO Auto-generated method stub
		int output=0;
		char arr[]=input.toCharArray();
		StringBuffer sb=new StringBuffer();
		sb.append(arr[arr.length-1]);
		for(int i=arr.length-1;i>0;i--)
		{
			int temp=Math.abs((int)arr[i]-(int)arr[i-1]);
			 sb.append(temp);
		}
		sb.reverse();
		output=Integer.parseInt(sb.toString());
		System.out.println(output);
	}
	
}
