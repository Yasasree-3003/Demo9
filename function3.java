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
public int input()//no argument with no return value 
{
Scanner s1=new Scanner(System.in);
int temp=s1.nextInt();
//int temp1=s1.nextInt();
return temp;
//return temp1;
}
}
class Test3
{
public static void main(String args[])
{
Demo d=new Demo();
d.displayMenu();
Scanner s1=new Scanner(System.in);
int n1=d.input();
int n2=d.input();
//d.add(n1,n2);
int r=d.sub(n1,n2);
System.out.println(n1+"-"+n2+"="+r);
}
}