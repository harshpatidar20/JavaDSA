import java.util.*;
public class invertedHalfPyramid
{
public static void main(String gg[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
/*  for(int i=1;i<=n;i++)
{
for(int j=1;j<=n-i+1;j++)
{
System.out.print(i+" ");
}
System.out.println();
}
}
} */

for(int i=n;i>=1;i--)
{
for(int j=1;j<=n-i+1;j++)
{
System.out.print(" ");
}
for(int j=1;j<=i;j++)
{
System.out.print(i);
}
System.out.println();
}
}
} 