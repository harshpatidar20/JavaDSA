import java.util.*;
public class reverseString
{
public static void main(String gg[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter the string:");
String str=sc.next();
String reversedStr="";

//for reverse the string

for(int i=str.length()-1;i>=0;i--)
{
reversedStr+=str.charAt(i);
}
System.out.println(reversedStr);
}
}

