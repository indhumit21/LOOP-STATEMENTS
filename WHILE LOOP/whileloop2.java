class whileloop2
{
	public static void main(String[] args)
	{
		int num=18;
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
		System.out.println("Sum :" +sum); //21
	}
}