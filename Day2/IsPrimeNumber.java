package week1.Day2;

public class IsPrimeNumber {
	public static void main(String[] args) 
	{
		int num=13;
		boolean isPrime=true;
		if(num==0||num==1) {
			System.out.println(num + " is not a prime number");
			}
		else
		{
			for(int i=2;i<=num/2;i++)
			{
			if(num%i==0)
			{
				isPrime=false;
			}
			}
			
		}
		if(isPrime)
		{
			System.out.println(num +" "+ "is a prime number");
		}
		else
		{
			System.out.println(num + " "+"is not a prime number");
		}
		}
	}                            

