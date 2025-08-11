import java.util.Scanner;

public class Assignment1 {
	
	public  static  void  print_table_of_number() {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number ");
		
		int x=s.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println(i*x);
		}
	}
	public  static  void  factorial() {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number which you want to find the factorial : ");
		
		int x=s.nextInt();
		
		if(x<1)
		{
			System.out.println("number cannot be less than 1 ");
		}else {
			int fact=1;
		for(int i=x;i>=1;i--)
		{
			fact*=i;
		}
		System.out.println("factorial of the givemn number is :"+fact);
		}
		
	}
	public   static  void primenumber() {
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number which you want to find whether it is prime or not  : ");
		
		int x=s.nextInt();
		int i=1;
		int count =0;
		if(x<=0)
		{
			System.out.println("Enter natural numbers only ");
		}else{
		while(i<x)
		{
			if(x%i==0) {
				count+=1;
			}
			i++;
		}
		if(count>1)
		{
			System.out.println("not prime number ");
		}
		else
		{
			System.out.println("prime number ");
		}
		}
		
		
		
	}
	public   static  void fibonaccinumber() {
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number which you want to print fibonacci series   : ");
		
		int x=s.nextInt();
		
		int a=0,b=1,c;
		for(int i=1;i<=x;i++)
		{
		 
		System.out.println(a+" ");
		c=a+b;
		a=b;
		b=c;
		}
		
		
		
		
		
	}

	


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter menu number :");
		String  n= sc.next();
		switch(n) {
		case "1": print_table_of_number();
		            break;
		case "2": factorial();
		           break;
		case "3": primenumber();
		           break;
		case "4": fibonaccinumber();
		           break;
		case "5": System.out.println("program exited thank you ");
		           break;
		}

	}

}
