import java.util.*;
public class calculator
{

void info(int a,int b)
{
int c=a+b;
System.out.println("your addition is "+c);
}
void sub(int a,int b)
{
int d=a-b;
System.out.println("your sub is "+d);
}
void multi(int a,int b)
{
int e=a*b;
System.out.println("your multi is "+e);
}
void div(int a,int b)
{
int f=a/b;
System.out.println("your div is "+f);
}

public static void main(String [] args)
{
Scanner sc=new Scanner (System.in);
calculator calculator=new calculator();
System.out.println("please enter a value");
int a=sc.nextInt();
System.out.println("please enter a value");
int b=sc.nextInt();

calculator.info(a,b);
calculator.sub(a,b);
calculator.multi(a,b);
calculator.div(a,b);

}
}

