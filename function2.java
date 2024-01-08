import java.util.Scanner;
class Demo
{
public void displayMenu()//no argument to return value function
{
System.out.println("+:Addition");
System.out.println("-:Subtraction\n*:Multiplication");
System.out.println("/:Division");
}
public int sub(int a,int b)// arguments with return value
{
int res=a-b;
return res;
}
}
class Test2
{
public static void main(String args[])
{
Demo d=new Demo();
d.displayMenu();
Scanner s1=new Scanner(System.in);
int n1=s1.nextInt();
int n2=s1.nextInt();
int r=d.sub(n1,n2);
System.out.println(n1+"-"+n2+"="+r);
}
}