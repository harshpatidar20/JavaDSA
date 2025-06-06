import java.util.*;
public class ValidateStackSequences
{
public static Boolean stackSeq(int pushed[], int popped[])
{
Stack<Integer> s=new Stack<>();
int j =0;
for(int num:pushed)
{
s.push(num);

while(!s.isEmpty() && s.peek()==popped[j])
{
s.pop();
j++;
}
}
return s.isEmpty();
}

public static void main(String gg[])
{
int pushed[]={1,2,3,4,5};
int popped[]={5,4,3,2,1};

System.out.println(stackSeq(pushed,popped));
}
}