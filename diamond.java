class diamond
{
public static void main(String [] args)
{
int a,b,c,d,e,f;

for(c=1;c<=10;c++)
{
for(e=1;e<=c;e++)
{
System.out.print(" ");
}
for(f=10;f>=c;f--)
{
System.out.print("* ");
}
System.out.println(" ");
}
for(a=1;a<=10;a++)
{
for(b=10;b>=a;b--)
{
System.out.print(" ");
}
for(d=1;d<=a;d++)
{
System.out.print("* ");
}
System.out.println(" ");
}
}
}
