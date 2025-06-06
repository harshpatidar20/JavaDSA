/*

not completed

*/
import java.util.*;
public class hollowButterfly
{
public static void main(String gg[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();

//upper part
//left portion
for(int i=1;i<=n;i++)
{
for(int j=1;j<=i;j++)
{
if(i==1 || j==1 || j==i)
{
System.out.print("*");            
}
else
{
System.out.print(" ");            
}
}
//right portion
for(int j=1;j<=2*(n-i);j++)
{
System.out.print(" ");            
}
for(int j=1;j<=i;j++)
{
if(i==1 || j==1 || j==i)
{
System.out.print("*");            
}
else
{
System.out.print(" ");            
}         
}
System.out.println();
}

//lower part

for(int i=n;i>=1;i--)
{
for(int j=1;j<=i;j++)
{
if(i==1 || j==1 || j==i)
{
System.out.print("*");            
}
else
{
System.out.print(" ");            
}
}

for(int j=1;j<=2*(n-i);j++)
{
System.out.print(" ");            
}
for(int j=1;j<=i;j++)
{
if(i==1 || j==1 || j==i)
{
System.out.print("*");            
}
else
{
System.out.print(" ");            
}         
}
System.out.println();
}


}
}
