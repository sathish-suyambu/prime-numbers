package begin;

import java.util.Scanner;

public class Primenumbers {
	public static void main(String[] args) {
		/*//basic rough work
		for(int i=2;i<7;i++){
		 j=7%i;
		}
		if(j==0)
		{
		System.out.println(j);
		}	else
		{System.out.println("prime"+j);
		}
		}}*/
		
		Scanner scan = new Scanner(System.in);
System.out.println("enter a number");
	int i = scan.nextInt();
	if(i>=2)
	{
	int b=0,g=i;
	for(int j=2;j<i;j++)
	{
		int pm=i%j;
		/*System.out.println(pm);*/
		if(pm==0)
		{
			System.out.println(g+" is not a prime number");
			b=1;
			if(b==1)
			{
			break;
			}
	}
		
	}
	if (b==0)
	{
		System.out.println(g+" is a prime number");
	}
	}
	if(i==0)
	{
		System.out.println("0 is not a prime number");
	}
	if(i==1)
	{
		System.out.println("1 is neigther a prime nor a composite number");
	}
	scan.close();
		}
	}
