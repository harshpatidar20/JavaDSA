import java.util.*;
public class circumferenceOfCircle
{
public static void circumferenceOfCircle(double r)
{
double pie=3.14;
double c=2*pie*r;
System.out.print(c);
return;
}
public static void main(String gg[])
{
Scanner sc=new Scanner(System.in);
double r=sc.nextDouble();
circumferenceOfCircle(r);
}
}

