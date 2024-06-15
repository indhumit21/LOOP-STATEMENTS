class primenumber
{
	public static void main (String[] args) 
	{
		int num=23;
		int a=1;
		int count=0;
		while(a<=num/2)
		{
			if(num%a==0)
			{
				count++;
			}                                                  //prime number
			a++;
		}
		if(count==1)
		{
		System.out.println("Prime Number");
		}
		else                                              
		{
		System.out.println("Not a Prime Number");
		}
	}
}
