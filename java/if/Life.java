class Life
{
	static int kid=14;
	static int young=20;
	static int adult=35;
	static int elder=70;
	static int countDays=80;
		public static void main(String a[])
		{
			System.out.println("What about LIFE bro");
			live();
		}
		public static void live()
		{
			if(isAlive())
			{	
				if(0<14)
				{
					System.out.println("Awsome days  Age 14");
				}
				if(14<20)
				{
					System.out.println("you're young boy Age 20");
				}
				if(20<35)
				{
					System.out.println("Now you're adult Age 35 ");
				}
				if(35<70)
				{
					System.out.println("now you're elder Age 70");
				}	
				if(70<80)
				{
					System.out.println("counting your last days Age 80");
				}					
			}
				System.out.println("Om Namha Shivayaaaa,,,,!");
		}
		public static boolean isAlive()
		{
			return true;//false
		}
}
