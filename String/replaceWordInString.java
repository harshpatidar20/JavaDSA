import java.util.*;
public class replaceWordInString
{
public static void main(String gg[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter the string:");
String original=sc.next();
String result="";

for(int i=0;i<original.length();i++)
{
if(original.charAt(i)=='e')
{
result+='i';
}
else
{
result+=original.charAt(i);
}
}
System.out.println(result);
}
}