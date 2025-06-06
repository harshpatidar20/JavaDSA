import java.util.*;
public class checkSortedArray
{
public static void main(String gg[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter the size:");
int size=sc.nextInt();
int number[]=new int[size];

// input

for(int i=0;i<size;i++)
{
number[i]=sc.nextInt();
}

// check if array is sorted

boolean isSorted=true;
for(int i=1;i<size;i++)
{                                                             
if(number[i]<number[i-1])
{
isSorted=false;
break;
}
}

// output

if(isSorted)
{
System.out.println("Sortd");
}
else
{
System.out.println("UnSortd");
}

}
}