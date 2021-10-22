class alphabet
{
public static void main(String [] args)
{
int a,b,alphabet=65;
for(a=0;a<=26;a++)
{
for(b=0;b<=a;b++)
{
System.out.print((char)(alphabet+b)+" ");
}
System.out.println();
}
}
}