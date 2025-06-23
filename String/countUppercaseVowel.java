import java.util.*;
public class countUppercaseVowel
{
public static void main(String gg[])
{
Scanner sc=new Scanner(System.in);
String str=sc.next();
int count=0;

// for upper case vowel

for(int i=0;i<str.length();i++)
{
char ch=str.charAt(i);
{
if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
{
count++;
}
}
}
System.out.println(count);
}
}