import java.util.*;
public class neon
{
	public static void main(String sap[])
	{
		int num2,num3,len,i,next,yt1;
		String num,hi;
		String yt="";
		Scanner nrt=new Scanner(System.in);
		System.out.println("enter a number");
		num=nrt.nextLine();
		num2=Integer.parseInt(num)
        num3=(num2*num2);
        hi=String.valueOf(num3);
        len=hi.length();
        for (i=0;i<len ;i++ ) {
        	char ch=hi.charAt(i);
        	yt=yt+ch;
        	yt1=Integer.parseInt(yt)
            next=next+yt1;
        }
        if (yt1==num2) {
        	System.out.println("it is a neon Number....");
        }
        else {
        	System.out.println("not a neon number...");
        }
        nrt.close();
	}
}
