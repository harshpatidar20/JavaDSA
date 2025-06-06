//final array state after Kth multiplication

import java.util.*;
public class ArrayKthMultiplication
{
public static int[] afterMult(int nums[],int k,int m)
{
for(int j=0;j<k;j++)
{
int minIndex=0;
for(int i=1;i<nums.length;i++)
{
if(nums[i]<nums[minIndex])
{
minIndex=i;
}
}
nums[minIndex]*=m;
}
return nums;
}

public static void main(String gg[])
{
int nums[]={2,5,3,6,7};
int result[]=afterMult(nums,3,2);
System.out.println(Arrays.toString(result));
}
}