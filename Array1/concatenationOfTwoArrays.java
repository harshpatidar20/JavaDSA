import java.util.*;

public class concatenationOfTwoArrays
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n1=sc.nextInt();
int n2=sc.nextInt();
int arr1[]=new int[n1];
int arr2[]=new int[n2];
int result[]=new int[n1+n2];

//input
System.out.println("Enter the elements of n1:");
for(int i=0;i<n1;i++)
{
arr1[i]=sc.nextInt();
}

System.out.println("Enter the elements of n2:");
for(int i=0;i<n2;i++)
{
arr2[i]=sc.nextInt();
}

//concatenating arrays
for(int i=0;i<n1;i++)
{
result[i]=arr1[i];
}
for(int i=0;i<n2;i++)
{
result[i+n1]=arr2[i];
}


//output
for(int i=0;i<result.length;i++)
{
System.out.print(result[i]+" ");
}

}
}
