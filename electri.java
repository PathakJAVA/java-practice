import java.util.*;
class electri
{
public static void main(String []args)
{
double b;
Scanner sc=new Scanner (System.in);
System.out.println("please enter your meter reading");
double a=sc.nextDouble();
if(a<100)
{
b=(a*1.10);
System.out.println("your electricity bill is rupee-"+b);
}
else if(a<200)
{
b=(a*2.20);
System.out.println("your electricity bill is rupee-"+b);
}
else if(a<500)
{
b=(a*3.30);
System.out.println("your electricity bill is rupee-"+b);
}
else
{
b=(a*4.40);
System.out.println("your electricity bill is rupee-"+b);
System.out.println("your connection is commercial");
}
}
}