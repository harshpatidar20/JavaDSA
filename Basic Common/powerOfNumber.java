import java.util.*;
public class powerOfNumber
{
public static void powerOfNumber(int x,int n)
{
if(x<1)
{
System.out.print("Invalid Number");
return;
}
if(x==1)
{
System.out.print("1");
return;
}
if(x>1)                                    // this is the main logic of this code
{
int result=1;
for(int i=1;i<=n;i++)
{
result=result*x;
System.out.println(result);
}                                                               
}
}
public static void main(String gg[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter the number:");
int x=sc.nextInt();
System.out.print("Enter the number:");
int n=sc.nextInt();
powerOfNumber(x,n);
}
}