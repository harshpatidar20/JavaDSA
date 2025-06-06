import java.util.*;
public class greatestCommonDivisor
{
public static void greatestCommonDivisor(int a,int b)
{
while(a!=b)
{
if(a>b)
{
a=a-b;
}
else
{
b=b-a;
}
}
System.out.println(b);
}
public static void main(String gg[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter the number:");
int a=sc.nextInt();
System.out.print("Enter the number:");
int b=sc.nextInt();
greatestCommonDivisor(a,b);
}
}