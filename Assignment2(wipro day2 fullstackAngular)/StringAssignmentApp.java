import java.util.Scanner;

public class StringAssignmentApp {
	
	public static int count_vowels(String  str) {
		int countv=0;
		int countc=0;
		for(int i=0;i<str.length();i++ ) {
			char ch=str.charAt(i);
			if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				countv++;
			}else
			{
				countc++;
			}
		}
		
		return countv;
		
	}
	
	
	public static int count_consonants(String  str) {
		int countv=0;
		int countc=0;
		for(int i=0;i<str.length();i++ ) {
			char ch=str.charAt(i);
			if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				countv++;
			}else
			{
				countc++;
			}
		}
		
		return countc;
		
	}
	
	public static void reverseString(String  str) {
		
		  
	        String reversed = new StringBuilder(str).reverse().toString();
	        System.out.println("Reversed: " + reversed); 
		
	}
	public static void toUpperCase(String  str) {
		  String upper = str.toUpperCase(); 
	        System.out.println("Uppercase: " + upper);
	}
	public static void toLowerCase(String  str) {
		 String lower = str.toLowerCase(); 
	        System.out.println("Lowercase: " + lower);
		
	}
	public static String replaceWord(String str, String oldWord, String newWord) {
        return str.replace(oldWord, newWord);
	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter menu number :");
		String  n= sc.next();
		sc.nextLine();
		
		switch(n) {
		case "1": System.out.println("enter the String to count vowels: ");
		           String str=sc.nextLine();
		          System.out.println(count_vowels( str));
		
		            break;
		case "2": System.out.println("enter the String to count consonants : ");
                  String st=sc.nextLine();
                   System.out.println( count_consonants( st));
		           break;
		case "3": System.out.println("enter the String : ");
                   String s=sc.nextLine(); 
			
			       reverseString(s);
		           break;
		case "4":  System.out.println("enter the String : ");
                    String stri=sc.nextLine(); 
		
			       toUpperCase( stri);
		           break;
		case "5": System.out.println("enter the String : ");
                   String a=sc.nextLine(); 
			
			       toLowerCase(a);
		           break;
		case "6": System.out.println("enter the String to count vowels: ");
                  String b=sc.nextLine();  
			
			      toLowerCase(b);
                  break;
                  
		case "7": System.out.println("enter the String to replace: ");
                   String y=sc.nextLine(); 
                   String oldWord=  sc.nextLine(); 
                   String newWord=  sc.nextLine(); 
                		   
	
                   replaceWord( y,oldWord,newWord);
                      break;
		case "8": System.out.println("program exited successfully");
		}
		
		

	}

}
