import java.util.*;
public class printEvenNumbers
{
public static void printEvenNumbers(int n)
{
for(int i=1;i<=n;i++)
{
if(i%2==0)
{
System.out.println(i);
}
}
}
public static void main(String gg[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter the number:");
int n=sc.nextInt();
printEvenNumbers(n);
}
}
