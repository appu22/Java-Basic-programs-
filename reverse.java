/*
1) write a program to reverse a number in java without using built in funcitions
2) write a program to reverse a number in java 
*/
appuuuu;

import java.util.Scanner;

public class swap2numbers//reverse
{
public static void main (String[] args)
      
{
	int rev,num,i;
		//num=1234;
	
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a number");
		
		num=sc.nextInt();
		//logic
		int org=num;
		
		rev=0;
		
		while(num!=0)
	    {
            rev = rev * 10 + num % 10;
			num = num/10;
		}
		System.out.println("Reverse number is :"+rev);
}
}
// program - 2
package reverse;

import java.util.Scanner;

public class reverse2 
{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		
		//logic
		//String Buffer class
		int rev;
		StringBuffer sb = new StringBuffer(String.valueOf(num));
		StringBuffer rev1=sb.reverse();	
		System.out.println("Reverse number is "+rev1);
	}

}
//logic - 3
package reverse;

import java.util.Scanner;

public class reverse2 
{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		
		//logic
		//String Buffer class
		int rev;
		StringBuilder sb = new StringBuilder(); //(String.valueOf(num));
		sb.append(num);
		StringBuilder rev1=sb.reverse();	
		System.out.println("Reverse number is "+rev1);
	}

}

