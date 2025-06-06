import java.util.*;
public class matrixAddition
{
public static void main(String gg[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Rows and Columns:");
int r=sc.nextInt();
int c=sc.nextInt();
int n1[][]=new int[r][c];
int n2[][]=new int[r][c];
int n3[][]=new int[r][c];

// for input values of matrix

System.out.println("Matrix1:");	
for(int i=0;i<r;i++)
{
for(int j=0;j<c;j++)
{
n1[i][j]=sc.nextInt();
}
}

System.out.println("Matrix2:");
for(int i=0;i<r;i++)
{
for(int j=0;j<c;j++)
{
n2[i][j]=sc.nextInt();
}
}

// for Addition

for(int i=0;i<r;i++)
{
for(int j=0;j<c;j++)
{
n3[i][j]=n1[i][j]+n2[i][j];
}
}

// for print output

System.out.println("Matrix3:");
for(int i=0;i<r;i++)
{
for(int j=0;j<c;j++)
{
System.out.print(n3[i][j]+" ");
}
System.out.println();
}
}
}

