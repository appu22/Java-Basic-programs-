package appuuuu;
import java.util.Scanner;

public class swap2numbers //palindrome
{
public static void main (String[] args)
      
{
	int rev,num,i;
		//num=1234;
	
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a number");
		
		num=sc.nextInt();
		
		int org=num;
		
		rev=0;
		
		while(num!=0)
	    {
            rev = rev * 10 + num % 10;
			num = num/10;
		}
		
		if(org==rev)
		{
			System.out.println(org +  "  is  palindrome");
		}
		else
		{
			System.out.println(org+  "  is not palindrome ");
		}
	
		

}
}
