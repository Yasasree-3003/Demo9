import java.util.Scanner;
class Demo
{
public long calculateFactorial(int n)
{
if(n==0)
{
return 1;
}
else 
{
return n*calculateFactorial(n-1);
}
}
}
class Test6
{
public static void main(String args[])
{
Scanner s1=new Scanner(System.in);
int p=s1.nextInt();
Demo d=new Demo();
System.out.println(d.calculateFactorial(p));
}
}
