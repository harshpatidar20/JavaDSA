// take a array of strings and combine them and find their length after combining the strings 

import java.util.*;
public class combineStringLength
{
public static void main(String gg[])
{
Scanner sc=new Scanner(System.in);

System.out.print("Enter number of strings: ");
int size=sc.nextInt();
String name[]=new String[size];
int totalLength=0;

StringBuilder combined=new StringBuilder(); 

System.out.println("Enter the strings:");
for(int i=0;i<size;i++)
{
name[i]=sc.next();
combined.append(name[i]);
totalLength+=name[i].length();
}

System.out.println("Combined String: " + combined.toString());
System.out.println("Total Length: " + totalLength);
}
}    