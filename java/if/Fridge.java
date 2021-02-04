class Fridge
{
	static String BrandName="LG";
	static double rate=23000.00;
	//static String ="Vegitables";
	
		public static void main(String a[])
		{
			
			System.out.println("Fridge Name " + BrandName);
			System.out.println("Fridge Price " + rate);
			
			//storeVegitables("potatoes");
			food();

		}
//****************************************
		/*public static void storeVegitables(String vegName)
		{ 
			String example=" onions , chilli";
			System.out.println("Vegitables can Store EX: " + example); 
			System.out.println("Vegitables can Store " +vegName );
		}*/
//***************************************
/*
		public static void food()
		{
			String name="Veg";
			String name1="Non-veg";
			if(isAllowed())
			{
				if(name==name1)
				{
					System.out.println(name1 +" is not allowed " );
				}
			}
			if(isAllowed())
			{
				if(name==name)
				{
					System.out.println(name+ " is allowed " );
				}
			}
			
		}
		public static boolean isAllowed()
		{
			return true;
		}
*/		static double minWeight=10;
		static double maxWeight=50;
		public static void food()
		{
			if(isAllowed())
			{
				if(minWeight<maxWeight)
				{
					System.out.println("You can insert the vegetables up to 50kg ");
				}
			}
			if(isAllowed())
			{
				if(maxWeight>minWeight)//50<10
				{
					 System.out.println("It is fulled....! ");
				}
			}
		}
		public static boolean isAllowed()
		{
			return true;
		} 
			 
	
	
}