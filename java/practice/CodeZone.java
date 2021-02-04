class CodeZone
{
	//static variables and Declaration
	static String empName="Raju";
	static int empAge=30;
	static int empId=345;
	static int empSalary=10000;
	public static void main(String v[])
	{
		System.out.println("****************Welcome to C O D E  Z O N E***********************************");
		manager("kiran",23,123,20000);//caller/calling  method arguments  
		System.out.println("");
		System.out.println("Details of Employee:" +empName +" Employee age:"+empAge+ " Employee Id:"+empId+ " Employee Salary:"+ empSalary);	
		System.out.println("");
		manager("Sachin ","TeamLead",24,1625,25000);
			
	}
	//method 
	public static void manager(String name,int age,int id, int salary)
	{
	   System.out.println("Details of manager Name:" +name +" age:"+ age+ " id:"+id+ " salary:"+ salary);//method parameters		
	}
	//method overriding 
	public static void manager(String name,String designation,int age,int id, int salary)
	{
	   System.out.println("Details of Team Lead  Name :" +name+"Designation: "+designation +" age:"+ age+ " id:"+id+ " salary:"+ salary);		
	}
}
