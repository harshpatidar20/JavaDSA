import java.util.*;
public class displaySubString
{
public static void main(String gg[])
{
Scanner sc=new Scanner(System.in);
String email=sc.next();
String username="";
for(int i=0;i<email.length();i++)
{
if(email.charAt(i)=='@')
{
break;
}
else
{
username+=email.charAt(i);
}
}
System.out.println(username);

}
}