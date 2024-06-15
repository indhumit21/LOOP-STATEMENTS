class palindrom
{
	public static void main(String[] args)
	{
		int num=9609;
		int rev=0;
		int copy=num;
		 while(num>0)
		 {
			 int t=num%10;
			 rev=rev*10+t;
			 num=num/10;
		 }
		 if(copy==rev)                                //Not a palindrom
		 {
			 System.out.println("palindrom");
		 }
		 else{
			 System.out.println("Not a panlidrom");
			 
		 }
	}
}

