import java.util.*;
public class printK
{
public static void main(String gg[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter the value of n:");
int n=sc.nextInt();
for(int i=1;i<=n;i++)
{
for(int j=1;j<=n-i+1;j++)
{
System.out.print("*");
}
System.out.println();
}

for(int i=2;i<=n;i++)
{
for(int j=1;j<=i;j++)
{
System.out.print("*");
}
System.out.println();
}
}
}