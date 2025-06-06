//find triangular sum of an Array

import java.util.*;
public class triangularSum
{
public static int findTriangularSum(int nums[])
{
while(nums.length>1)
{
int newnums[]=new int[nums.length-1];
for(int i=0;i<nums.length-1;i++)
{
newnums[i]=(nums[i]+nums[i+1])%10;
}
nums=newnums;
}
return nums[0];
}

public static void main(String gg[])   //for output
{
int nums[]={2,5,2,8,9,5};
int results=findTriangularSum(nums);
System.out.println(results);
}
}
