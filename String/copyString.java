import java.util.*;
public class copyString
{
public static void main(String gg[])
{
Scanner sc=new Scanner(System.in);
String str=sc.next();
String copy="";

//for copy one string into another string

for(int i=0;i<str.length();i++)
{
copy+=str.charAt(i);
}
System.out.print(copy);

}
}