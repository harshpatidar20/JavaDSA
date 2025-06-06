import java.util.*;
public class SortStack
{
public static void main(String gg[])
{
Stack<Integer> s=new Stack<>();
s.push(3);
s.push(1);
s.push(9);
s.push(7);
s.push(34);

//sort in decending order

Collections.sort(s);

//sort in ascending order

Collections.sort(s,Collections.reverseOrder());

while(!s.isEmpty())
{
System.out.println(s.pop());
}
System.out.println();
}
}