import java.util.*;
public class oddSum
{
public static void oddSum(int n)
{
int sum=0;
for(int i=1;i<=n;i++)
{
if(i%2!=0)
{
sum=sum+i;
}
}
System.out.print(sum);
}
public static void main(String gg[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter the number:");
int n=sc.nextInt();
oddSum(n);
}
}