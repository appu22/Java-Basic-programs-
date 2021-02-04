class Phone
{
	static int minCharger=10;
	static int maxCharge=90;
	//static boolean isConnected=true;
	public static void main(String a[])
	{
		charge();
		charge();
	}
	public static void charge()
	{
		boolean isConnected=false;//false
		if(isConnected)
		{
			if(minCharger<maxCharge)
			{
				minCharger=minCharger+1;
				System.out.println("Charger is Connected "+minCharger);
			}
		}
		System.out.println("Charger is not Connected ");

	}
}