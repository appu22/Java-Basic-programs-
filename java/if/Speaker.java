class Speaker //
{
	static int maxVol=100;
//	static boolean isConnected=true;//false
	static int currentVol=20;
	static String brandName;
	static int minVol=0;
	public static void main (String a[])
	{
		String brandName="Bose";
		double price=2000.00;
		System.out.println("Brand Name:"+brandName);
		System.out.println("Prcie:"+price);
		increase();
		decrease();		
	}
	public static void increase()
	{
		if(isConnected())
		{
			if(currentVol<maxVol)
			{
				currentVol=currentVol+5;
				System.out.println("Increasing the volume  "+currentVol);
			}
			
		}
		
	}
	public static void decrease()
	{
		if(isConnected())
		{
			if(currentVol>minVol)//if(currentVol<minVol)This condition is false if you use it
			{
				currentVol=currentVol-5;
				System.out.println("decreasing the volume " +currentVol);
			}
		}
	}
	public static boolean isConnected()
	{
		return true;
	}
}