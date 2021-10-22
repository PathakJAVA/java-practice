import java.util.*;
class angle
{
public static void main(String [] args)
{
int d;
Scanner sc=new Scanner (System.in);
System.out.println("please enter a number");
int a=sc.nextInt();
System.out.println("please enter second number");
int b=sc.nextInt();
System.out.println("please enter third number");
int c=sc.nextInt();
d=(a+b+c);
System.out.println("total of three angels are"+d);
if(d<60)
{
System.out.println("your angle is acute");
}
if((d>60)&&(d<90))
{
System.out.println("your angle is scalene triangle");
}
if(d==90)
{
System.out.println("your angle is right angle");
}
if((d>90)&&(d<120))
{
System.out.println("your angle is isosceles tringle");
}
if((d>120)&&(d<180))
{
System.out.println("your angle is obtuse");
}
if(d==180)
{
System.out.println("straight line");
}
}
}