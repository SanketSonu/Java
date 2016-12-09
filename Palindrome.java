import java.util.*;
class Palindrome {
public static void main(String[] args) {
String org,rev="";
Scanner scan=new Scanner(System.in);
System.out.println("Enter string to check palindrome");
org=scan.nextLine();
int length = org.length();
for( int i=length-1; i>=0;i--)
	rev = rev + org.charAt(i);
if(org.equals(rev))
         System.out.println("Entered string is a palindrome.");

else
	 System.out.println("Entered string is not a palindrome.");

	}
     }
