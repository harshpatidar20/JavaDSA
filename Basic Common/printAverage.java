import java.util.*;
public class printAverage
{
public static int printAverage(int x,int y,int z)
{
double sum=x+y+z;
double avg=sum/3;
{
System.out.print(avg);
}
return 0;
}
public static void main(String gg[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter the value of x:");
int x=sc.nextInt();
System.out.print("Enter the value of y:");
int y=sc.nextInt();
System.out.print("Enter the value of z:");
int z=sc.nextInt();
printAverage(x,y,z);
}
}

