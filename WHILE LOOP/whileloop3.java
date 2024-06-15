class whileloop3
{
	public static void main(String[] args)
	{
		int num=29;
		int a=1;
		int sum=0;
		while(a<=num/2)
		{
			if(num%a==0)
			{
				sum=sum+a;
			}
			a++;
		}
		if(sum==num)
		{
			System.out.println("Perfect Number");
		}
		else
		{
		System.out.println("Not perfect Number");    
		}		//28 is perfect
	}
}
