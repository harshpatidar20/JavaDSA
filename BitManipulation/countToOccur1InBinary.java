import java.util.*;
public class countToOccur1InBinary
{
public static void main(String gg[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter the decimal number:");
int n=sc.nextInt();
int count=0;

//logic for conversion of decimal number into binary

String binary=Integer.toBinaryString(n);

// count 1'ones occur in binary String

for(int i=0;i<binary.length();i++)
{
if(binary.charAt(i)=='1')
{
count++;
}
}
System.out.print(count);
}
}