import java.util.*;
public class name
{
public static void main(String gg[])
{
Scanner sc=new Scanner(System.in);
int size=sc.nextInt();
String names[]=new String[size];
for(int i=0;i<size;i++)
{
names[i]=sc.next();
}
for(int i=0;i<size;i++)
{
System.out.println("Names:"+names[i]);
}
}
}