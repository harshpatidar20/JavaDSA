import java.util.*;
public class nextGreaterRight
{
public static void main(String gg[])
{
int arr[]={5,7,2,8,4};
Stack<Integer> s=new Stack<>();
int nextGreater[]=new int[arr.length];

for(int i=arr.length-1;i>=0;i--)
{
while(!s.isEmpty() && arr[s.peek()]<=arr[i])
{
s.pop();
}

if(s.isEmpty())
{
nextGreater[i]=-1;
}
else
{
nextGreater[i]=arr[s.peek()];         //for print index change only one line : nextGreater[i]=s.peek();
}
s.push(i);
}

for(int i=0;i<nextGreater.length;i++)
{
System.out.print(nextGreater[i]+" ");
}
System.out.println();
}
}