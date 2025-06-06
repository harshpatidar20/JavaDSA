import java.util.*;
public class voting
{
public static void voting(int n)
{
if(n>=18)
{
System.out.print("Eligible to vote");
return;
}
System.out.print("Not Eligible to vote");
}
public static void main(String gg[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter the age:");
int n=sc.nextInt();
voting(n);
}
}
