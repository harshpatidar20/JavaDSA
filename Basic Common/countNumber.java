import java.util.*;
public class countNumber
{
public static void countNumber(int count)
{
if(count<0)
{
System.out.print("Negative:"+count);
return;
}
if(count==0)
{
System.out.print("Zero:"+count);
}                                                            not completed
if(count>0)
{
System.out.print("Positive:"+count);
}
}
public static void main(String gg[])
{
int[] count={2,5,6,0,0,-2,-7};
System.out.println("Numbers:"+count);
}
}