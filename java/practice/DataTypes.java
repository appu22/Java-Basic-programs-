class DataTypes
{
	public static void main(String v[])
	{
		// 8 primitive Data Types and default values
		
		byte a=127;
		System.out.println("Byte  default size: 1byte(8bit) and range "+a);
		
		short b=32767;
		System.out.println("short default size: 2byte(16bit) and range "+b);
		
		int c=1223;
		System.out.println("int default size: 4byte(32bit)  "+c);
		
		long d=3451234l;
		System.out.println("long default size: 8byte(64bit)"+d);
		
		float e=121.0f;
		System.out.println("float default size: 4byte(32bit) "+e);
		
		double f=231423.121d;
		System.out.println("double default size: 8byte(64bit) "+f);
		
		char g='A';
		System.out.println("char default size: 2byte(16bit) "+g);
		
		boolean h=true;
		System.out.println("boolean default size: false (1bit) "+h);
		
		//non primitive data types is always start with Uppercase letter
		String name="DATA TYPES";
		System.out.println("String type");
	}
}