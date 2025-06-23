import java.util.*;
public class convertUppercaseToLowercase
{
public static void main(String gg[])
{
Scanner sc=new Scanner(System.in);
String str=sc.next();

//for convert upper case into lower case

for(int i=0;i<str.length();i++)
{
char ch=str.charAt(i);
{
if(ch>=65 && ch<=90)
{
ch+=32;
}
}
System.out.print(ch);
}

}
}