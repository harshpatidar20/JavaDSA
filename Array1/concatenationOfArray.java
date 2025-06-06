import java.util.*;
public class concatenationOfArray
{
public static void main(String gg[])
{
Scanner sc=new Scanner(System.in);
int n1=sc.nextInt();
int nums[]=new int[n1];
int ans[]=new int[2*n1];

// for input

for(int i=0;i<n1;i++)
{
nums[i]=sc.nextInt();
}

// logic for concatenation array 

for(int i=0;i<n1;i++)
{
ans[i]=nums[i];
ans[i+n1]=nums[i];
}
System.out.println(Arrays.toString(ans));
}
}