import java.util.*;
public class decimaltoBinary1
{
public static void main(String gg[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter the decimal number:");
int n=sc.nextInt();

//logic for conversion of decimal number into binary

String binary=Integer.toBinaryString(n);
System.out.print("Binary number is:"+binary);

}
}