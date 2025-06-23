import java.util.*;
public class countLowercaseVowel
{
public static void main(String gg[])
{
Scanner sc=new Scanner(System.in);
String str=sc.next();
int count=0;

// for lower case vowel

for(int i=0;i<str.length();i++)
{
char ch=str.charAt(i);
{
if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
{
count++;
}
}
}
System.out.println(count);
}
}