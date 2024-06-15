class  square19
{
	public static void main(String[] args)
	{
		int n=5;
		int val=1;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
			if((i+j)%2==0)
			{
				System.out.print(val +" ");   //1 0 1 0 1
			}                                 //0 1 0 1 0             
			else{                             //1 0 1 0 1
			System.out.print("0" +" ");       //0 1 0 1 0
			}                                 //1 0 1 0 1
			}
			System.out.println();
		}
	}
}
