import java.util.Scanner;
class Main
{
public static void main(String args[])
{
Scanner s1=new Scanner(System.in);
int sum=0,n;
int a=0;
int b=1;
System.out.println("Enter the nth value");
n=s1.nextInt();
System.out.println("Fibonacci series:"+a+" "+b+" ");
while(sum<=n)
{
System.out.print(sum +" ");
a=b;
b=sum;
sum=a+b;
}
}
}