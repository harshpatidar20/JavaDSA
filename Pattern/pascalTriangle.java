import java.util.*;
public class pascalTriangle
{
public static void main(String gg[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();

for(int i=1;i<=n;i++)
{
for(int j=1;j<=n-i;j++)
{                                                       not completed
System.out.print(" ");
}
for(int j=1;j<=i;j++)
{
System.out.print(i+" ");
}
System.out.println();
}

}
}

