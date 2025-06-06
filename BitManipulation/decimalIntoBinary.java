import java.util.*;
public class decimalIntoBinary
{
public static void main(String gg[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter the number:");
int n=sc.nextInt();
String binary="";
int remainder;

for(int i=n;i>0;i=i/2)
{
remainder=i%2;
binary=remainder+binary;
}

if(n==0)
{
binary="0";
}
System.out.println(binary);
}
}