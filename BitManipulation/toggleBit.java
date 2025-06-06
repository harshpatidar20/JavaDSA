import java.util.*;
public class toggleBit
{
public static void main(String gg[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter the number:");
int n=sc.nextInt();
System.out.print("Enter the position:");
int pos=sc.nextInt();
int bitMask=1<<pos;
int newBitMask=n^(bitMask);
System.out.println("Number after toggle:"+newBitMask);
}
}