import java.util.*;
class dowhuserloop
{
public static void main(String[] args)
{
int c;
Scanner sc=new Scanner (System.in);
System.out.println("please enter starting value");
int a=sc.nextInt();
System.out.println("please enter ending value");
int b=sc.nextInt();
c=a;
do
{
System.out.println(+c);
c++;
}
while(c<=b);

}
}