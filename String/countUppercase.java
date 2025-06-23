import java.util.*;

public class countUppercase
{
public static void main(String gg[])
{
Scanner sc=new Scanner(System.in);
String str=sc.next();
int count=0;

// for upper case 

for(int i=0;i<str.length();i++)
{
char ch=str.charAt(i);
{
if(ch>=65 && ch<=90)
{
count++;
}
}
}
System.out.println(count);
}
}