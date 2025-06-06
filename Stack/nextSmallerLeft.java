import java.util.*;
public class nextSmallerLeft
{
public static void main(String gg[])
{
int arr[]={3,6,2,8,5};
Stack<Integer> s=new Stack<>();
int nxtSmall[]=new int[arr.length];

for(int i=0;i<=arr.length-1;i++)
{
while(!s.isEmpty() && arr[s.peek()]>=arr[i])
{
s.pop();
}
if(s.isEmpty())
{
nxtSmall[i]=-1;                                
}
else
{
nxtSmall[i]=arr[s.peek()];
}
s.push(i);
}

for(int i=0;i<nxtSmall.length;i++)
{
System.out.print(nxtSmall[i]+" ");
}
System.out.println();
}
}