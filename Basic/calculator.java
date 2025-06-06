import java.util.*;
public class calculator{
public static void main(String gg[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number:");
int a=sc.nextInt();
System.out.println("Enter the number:");
int b=sc.nextInt();
int num=sc.nextInt();
int sum=a+b;
int diff=a-b;
int mul=a*b;
double div=a/b;
int mod=a%b;
switch(num){
case 1: System.out.println("Sum:"+sum);
break;
case 2: System.out.println("Diff:"+diff);
break;
case 3: System.out.println("Mul:"+mul);
break;
case 4: if(b==0){
        System.out.println("Invaid Division");
        }
        else
        {
        System.out.println("Div:"+div);
        }     
        break;
case 5: if(b==0){
        System.out.println("Invaid Division");
        }
        else
        {
        System.out.println("Mod:"+mod);
        }     
        break;
default: System.out.println("Invalid Number");
}
}
}
