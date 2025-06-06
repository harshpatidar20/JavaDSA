
// found number in an array and print it's index and print count i.e. how many times it comes in an array

import java.util.*;
public class searchNumber                    
{
public static void main(String gg[])
{
Scanner sc=new Scanner(System.in);
int rows=sc.nextInt();
int cols=sc.nextInt();
int [][]numbers=new int[rows][cols];

// for input

for(int i=0;i<rows;i++)
{
for(int j=0;j<cols;j++)
{
numbers[i][j]=sc.nextInt();
}
}

// for search

int x=sc.nextInt();

// for output  and print it's index

int count=0;
boolean found=false;
for(int i=0;i<rows;i++)
{
for(int j=0;j<cols;j++)
{
if(x==numbers[i][j])
{
System.out.println("["+i+"]"+","+"["+j+"]");
found=true;
count++;
{
System.out.println("Count: "+count);
}
}
}
}

// 'x' is not found in an array 

if(!found)
{
System.out.println("Not found: "+x);
}

}
}
