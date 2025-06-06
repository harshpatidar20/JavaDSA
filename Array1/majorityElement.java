import java.util.*;
public class majorityElement
{
public static void main(String gg[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter the size:");
int size=sc.nextInt();
int number[]=new int[size];

// input from user

for(int i=0;i<size;i++)
{
number[i]=sc.nextInt();
}

//  main logic of majority element
// Boyer-Moore Majority Vote Algorithm                                                                          

int count = 0;
int candidate=0;
for(int num:number)
{
if(num==candidate) 
{
count++;
}
}                                                       //not completed

if(count>size/2) 
{
System.out.println("Majority Element: " + candidate);
} 
else 
{
System.out.println("No Majority Element found.");
}


}
}