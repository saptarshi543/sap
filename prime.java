/*a short trick to find if a number is prime or not is to>>
check if the sum of the number is divisible by 3 or not
if divisible it is not aprime number
if not divisible it is a prime number*/
import java.util.*;
public class prime
{
	public static void main(String sap[])//with original logic..
	{
		int num,i;
		boolean flag;
      Scanner nrt=new Scanner(System.in);
      System.out.println("enter a number..");
       num=nrt.nextInt();
       for (i=2;i<num ;i++ ) 
       {
       	if ((num%i)==0) {
       	flag =true;
       	break;
       	}
       	else continue;
       	}
       	if (flag=true) {
       		System.out.println("it is a prime no.");
       	}
       	else {
       		System.out.println("it not a prime no.");
       	}
       }
	}
