import java.util.*;
public class anagrams
{
public static void main(String gg[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter the string:");
String str1=sc.next();
System.out.print("Enter the another string:");
String str2=sc.next();

str1=str1.toLowerCase();                             // convert to lower case 
str2=str2.toLowerCase();

if(str1.length()!=str2.length())                     // compare the lengths of both strings
{
System.out.println("Not Anagrams");
return;
}

char arr1[]=str1.toCharArray();                      // convert to character array
char arr2[]=str2.toCharArray();


Arrays.sort(arr1);                                   // sort the both arrays
Arrays.sort(arr2);

if(Arrays.equals(arr1,arr2))                         // compare sorted arrays
{
System.out.println("The strings are anagrams");
}
else
{
System.out.println("The strings not are anagrams");
}

}
}