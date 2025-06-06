// find Array State After Kth Multiplication Operation

import java.util.*;
public class findArray
{
public static void main(String gg[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter the size of array:");
int n=sc.nextInt();
System.out.print("Enter the value of k:");
int k=sc.nextInt();
System.out.print("Enter the value of m:");
int m=sc.nextInt();

System.out.print("Enter the values in array:");
int nums[]=new int[n];

for(int i=0;i<n;i++)
{
nums[i]=sc.nextInt();
}

// main logic

for(int j=0;j<k;j++)                                      
{
int minIndex=0;
for(int i=1;i<n;i++)
{
if(nums[i]<nums[minIndex])
{
minIndex=i;
}
}
nums[minIndex]*=m;
}

//output

System.out.println("Array after "+k+" operations:");
for(int num:nums)
{
System.out.print(num+" ");
}

}
}