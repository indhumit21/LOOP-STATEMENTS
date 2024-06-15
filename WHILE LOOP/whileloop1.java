class whileloop1
{
	public static void main(String[] args)
	{
		int num=18;
		int a=1;
		while(a<=num/2)
		{
			if(num%a==0)
			{
				System.out.print(a +" ");
			}
			a++;                                      //1 2 3 6 9 
		}
		
	}
}