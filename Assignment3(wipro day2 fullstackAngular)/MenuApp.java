import java.util.Scanner;
   class MathOperations{
	public void   printTable(int x){
		 
			
		
			for(int i=1;i<=10;i++)
			{
				System.out.println(i*x);
			}
	 }
	 public void calculateFactorial(int x){
		
			
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
	public void  checkPrime(int x){
		
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
	 public void printFibonacci(int x){
		
			
			
			int a=0,b=1,c;
			for(int i=1;i<=x;i++)
			{
			 
			System.out.println(a+" ");
			c=a+b;
			a=b;
			b=c;
			}
			
			
	 }
}

public class MenuApp extends MathOperations  {

	public static void main(String[] args) {
		MathOperations obj=new MathOperations();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter menu number :");
		String  n= sc.next();
		switch(n) {
		case "1":
			      
			        System.out.println("enter the number ");
			        int l=sc.nextInt();
			       obj.printTable( l);
		            break;
		case "2": 
			      
	               System.out.println("enter the number ");
	               int a=sc.nextInt();
	               obj.calculateFactorial( a);
		           break;
		case "3": 
                   System.out.println("enter the number ");
                   int b=sc.nextInt();
			      obj.checkPrime( b);
		           break;
		case "4": 
                  System.out.println("enter the number ");
                   int c=sc.nextInt();
			       obj.printFibonacci( c);
		           break;
		case "5": 
			         Scanner number =new Scanner(System.in);
	                 System.out.println("enter the number ");
	                 int d=number.nextInt();
			         System.out.println("program exited thank you ");
		             break;
		}

	}

}
