import java.util.Scanner;
class Demo
{
public void displayMenu()//no argument to return value function
{
System.out.println("+:Addition");
System.out.println("-:Subtraction\n*:Multiplication");
System.out.println("/:Division");
}
public void add(int a,int b)// arguments with no return value
{
int res=a+b;
System.out.println(a+"+"+b+"="+res);
}
}
class Test1
{
public static void main(String args[])
{
Demo d=new Demo();
d.displayMenu();
Scanner s1=new Scanner(System.in);
int n1=s1.nextInt();
int n2=s1.nextInt();
d.add(n1,n2);
}
}