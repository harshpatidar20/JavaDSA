import java.util.*;
public class numberRectangle
{
public static void main(String gg[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int m=sc.nextInt();
for(int i=1;i<=n;i++)
{
for(int j=1;j<=m;j++)
{
if(i==1 || j==1 || i==n || j==m)
{
System.out.print(4);
} else if(i==2 || j==2 || i==n-1 || j==m-1)
{
System.out.print(3);
} else if(i==3 || j==3 || i==n-2 || j==m-2)
{
System.out.print(2);
}
else if(i==4 || j==4 || i==n-3 || j==m-3)
{
System.out.print(1);
}
}
System.out.println();
}
}
}
