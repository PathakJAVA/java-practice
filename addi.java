import java.util.*;
public class addi
{
int a,b,c;
addi()
{
Scanner sc=new Scanner (System.in);
System.out.println("please enter a value");
a=sc.nextInt();
System.out.println("please enter second value");
b=sc.nextInt();
}
void add()
{
c=a+b;
System.out.println("your addition is :"+c); 
}
public static void main(String args[])
{

addi obj=new addi();
obj.add();
}
}