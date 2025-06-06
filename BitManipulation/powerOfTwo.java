import java.util.*;
public class powerOfTwo
{
public static void main(String gg[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter the position:");
int pos=sc.nextInt();
System.out.print("Enter the value of n:");
int n=sc.nextInt();
int bitMask=1<<pos;

//logic for check power of two

if((bitMask & n)==0)
{
System.out.println("Number is not a power of two");
}
else
{
System.out.println("Number is power of two");
}
}
}