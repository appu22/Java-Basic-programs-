//prime mnumber 
//a number that is divisible only by itself and 1
import java.util.Scanner; 
public class PrimeFact{
	public static void main(String a[]){
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter n number ");
		int n =scanner.nextInt();
		factorial(n);
// 		 primeNumber(n)
	}
	public static void primeNumber(int n){	
		System.out.println("** Prime number ** ");
		boolean f=false;
		for(int i = 2; i<=n/2; i++)
		{
			//6==/2 
			if(n%i ==0)
			{
				f=true;
				break;
			}
		}
		if(!f){
			 //false
			System.out.println("is Prime number ");
		}else{
			//true
			System.out.println("not prime number ");
		}
	}//factorial == !5   5*4 5*3 5*2 5*1 = 120
	public static void factorial(int n){
		System.out.println("** Factorial  ** ");
		int fact=1;
		
		for(int i=1; i<=n; i++){
			fact=fact*i;
		
		}
		System.out.println("Factorial of given number is "+fact);
	}
}
