import java.util.*;
public class countLowercase
{
public static void main(String gg[])
{
Scanner sc=new Scanner(System.in);
String str=sc.next();
int count=0;

// for lower case 

for(int i=0;i<str.length();i++)
{
char ch=str.charAt(i);
{
if(ch>=97 && ch<=122)
{
count++;
}
}
}
System.out.println(count);
}
}