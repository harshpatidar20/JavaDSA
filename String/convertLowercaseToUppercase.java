import java.util.*;
public class convertLowercaseToUppercase
{
public static void main(String gg[])
{
Scanner sc=new Scanner(System.in);
String str=sc.next();

// for convert lower case string into upper case string

for(int i=0;i<str.length();i++)
{
char ch=str.charAt(i);                                                       
{
if(ch>=97 && ch<=122)
{
ch-=32;
}
}
System.out.print(ch);
}
}
}