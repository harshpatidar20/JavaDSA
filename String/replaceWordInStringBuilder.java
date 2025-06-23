import java.util.*;
public class replaceWordInStringBuilder
{
public static void main(String gg[])
{
Scanner sc=new Scanner(System.in);
String original=sc.next();
StringBuilder sb=new StringBuilder(original);
String result="";
StringBuilder sk=new StringBuilder(result);

// for replace word and print new string after replace

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