class Atm1
{
	public static void main(String[] args)
	{
		int option=2;
		switch(option) //int or char or string
		{
			case 1:System.out.println("Withdrawl");
			break;
			
			case 2:System.out.println("Balance enquiry");
			break;
			
			case 3:System.out.println("pin change");
			break;
			
			case 4:System.out.println("mini statement");
			break;
			
			default:
			System.out.println("Invalid selection");
		}
	}
	
}