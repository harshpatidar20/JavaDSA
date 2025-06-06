import java.util.*;
public class maxMiniNumber
{
public static void main(String gg[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter the size:");
int size=sc.nextInt();
int number[]=new int[size];

// for input values of array

for(int i=0;i<size;i++)
{
number[i]=sc.nextInt();
}

// for maximum value

int max=Integer.MIN_VALUE;

// for minimum value

int min=Integer.MAX_VALUE;

//logic for finding max. and mini. number

for(int i=0;i<number.length;i++)
{                                                          
if(number[i]>max)
{
max=number[i];
}
if(number[i]<min)
{
min=number[i];
}
}
System.out.println("Largest Number:"+max);
System.out.println("Smallest Number:"+min);
}
}