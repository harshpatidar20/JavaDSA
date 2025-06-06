import java.util.*;
public class binaryToDecimal
{
public static void main(String gg[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter the decimal number:");
String str=sc.next();

//logic for conversion of binary number into decimal

int decimal=Integer.parseInt(str,2);
System.out.print("Binary number is:"+decimal);

}
}