class Demo
{
public void displayMenu()//no argument to return value function
{
System.out.println("+:Addition");
System.out.println("-:Subtraction\n*:Multiplication");
System.out.println("/:Division");
}
}
class Test
{
public static void main(String args[])
{
Demo d=new Demo();
d.displayMenu();
}
}