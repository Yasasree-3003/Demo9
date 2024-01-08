import java.util.Scanner;
class Demo
{
public long calculateFactorial(int n)
{
long fact=1;
if(n==0)
{
return 1;
}
else 
{
for(int i=1;i<=n;i++)
fact=fact*i;
}
return fact;
}
}
class Test7
{
public static void main(String args[])
{
Scanner s1=new Scanner(System.in);
int p=s1.nextInt();
Demo d=new Demo();
System.out.println(d.calculateFactorial(p));
}
}
