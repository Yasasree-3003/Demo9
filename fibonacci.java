import java.util.Scanner;
class fibonacci
{
public static void main(String args[])
{
int i;
Scanner s1=new Scanner(System.in);
int a=s1.nextInt();
int b=s1.nextInt();
System.out.print(a+","+b+",");
for(i=0;i<20;i++)
{
int c=a+b;
System.out.print(c+",");
a=b;
b=c;
}
if(i==20)
{
System.out.println(".");
}
}
}

