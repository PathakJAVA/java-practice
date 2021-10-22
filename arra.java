import java.util.*;
class arra
{
public static void main(String [] args)
{
Scanner sc=new Scanner (System.in);
System.out.println("enter the number of elements you want to store");
int a=sc.nextInt();

int[] array=new int[a];
System.out.println("enter the elements of the array");


for(int i=0;i<a;i++)
{
array[i]=sc.nextInt();
}

System.out.println("array elements are:");
for(int i=0;i<a;i++)
{
System.out.println(array[i]);
}
}
}