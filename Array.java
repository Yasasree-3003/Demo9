import java.util.Scanner;
class Demo
{
public int[] input()
{
Scanner s1=new Scanner(System.in);
int n=s1.nextInt();
int[] arr=new int[n];
System.out.println("please type"+n+"Integers:");
for(int i=0;i<arr.length;i++)
{
arr[i]=s1.nextInt();
}
return arr;
}
public int add(int[] a)
{
int sum=0;
for(int i=0;i<a.length;i++)
{
sum+=a[i];
}
return sum;
}
}
class Test5
{
public static void main(String args[])
{
Demo d=new Demo();
int[] array=new int[5];
array=d.input();
int res=d.add(array);
System.out.println(res);
}
}