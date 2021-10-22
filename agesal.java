import java.util.*;
class agesal
{
public static void main(String [] args)
{
Scanner sc=new Scanner (System.in);
System.out.println("please enter your age-");
int a=sc.nextInt();
System.out.println("please enter your experience");
int b=sc.nextInt();
if((a<30)&&(b<5))
{
System.out.println("your salary is 10000");
}
if((a>30)&&(b<5))
{
System.out.println("your salary is 12500");
}
if((a<30)&&(b>5))
{
System.out.println("your salary is 15000");
}
if((a>30)&&(b>5))
{
System.out.println("your salary is 17500");
}
}
}