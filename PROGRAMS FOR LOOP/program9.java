class program9
{
	public  static void main(String[] args)
	{
		int n=100;
		char val='a';
		for (int i=0;i<n;i++)
		{
			if(i%n/2==0)
			{
				System.out.print(val+" ");
				val++;
			}
			else
			{
				val--;
			}
		}
	}
	
}