class strong
{
	public static void main(String[] arga)
	{
		int num=145;
		int sum=0;
		int copy=num;
		while (num>0)
		{
			int n=num%10;
			int fact=1;
			while(n>0)
			{
				fact=fact*n;
				n--;
			}
			sum=sum+fact;
			num=num/10;
		}
		if(sum==copy)                                               //strong number
		{
			System.out.println("Strong Number");
		}
		else
		{
			System.out.println("Not a Strong Number");
		}
	}
}

