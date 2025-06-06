import java.util.*;
public class greaterNumber
{
public static void greaterNumber(int x,int y)
{
if(x>y)
{
System.out.print(x+" is greater");
return;
}
System.out.print(y+" is greater");
}
public static void main(String gg[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter the value of x:");
int x=sc.nextInt();
System.out.print("Enter the value of y:");
int y=sc.nextInt();
greaterNumber(x,y);
}
}
