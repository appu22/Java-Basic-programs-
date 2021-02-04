class Laptop
{
	static String brandName="HP";
	public static void main(String a[])
	{
		double price=25000.00;
		System.out.println("Brand Name: "+ brandName);
		System.out.println("Laptop Price:  "+ price);
		watchMovies();
		
	}
	public static void watchMovies()
	{
		 int minBattery=20;
		int maxBattery=80;
		if(isConnected())
		{
			if(minBattery<maxBattery)
			{
				System.out.println("Please Plug in *Your charger less than 20%");
			}
			
		}
		if(isConnected())
			{
				if(maxBattery>minBattery)
				{
					System.out.println("Please Remove Plug *charged 100%");
				}
			}
		
	}
			
	public static boolean isConnected()
	{
		return false;
	}
	/*public static boolean isConnected2()
	{
		return false;
	}*/
}
