import java.util.List;
import java.util.ArrayList;
class Main2
{
public static void main(String args[])
{
List<Integer>numbers=new ArrayList<>();
numbers.add(11);
numbers.add(22);
numbers.add(33);
numbers.add(44);
numbers.add(55);
System.out.println("List:"+numbers);
int number=numbers.get(2);
System.out.println("Accessed Element:"+number);
int removedNumber=numbers.remove(1);
System.out.println("Removed Element:"+removedNumber);
System.out.println("List:"+numbers+"\n");

List<String>numbers1=new ArrayList<>();
numbers1.add("Dog");
numbers1.add("Horse");
numbers1.add("Lion");
numbers1.add("Tiger");
numbers1.add("Cat");
System.out.println("List:"+numbers1);
String number1=numbers1.get(3);
System.out.println("Accessed Element:"+number1);
String removedNumber1=numbers1.remove(4);
System.out.println("Removed Element:"+removedNumber1);
System.out.println("List:"+numbers1+"\n");

List<Double>numbers2=new ArrayList<>();
numbers2.add(45.9);
numbers2.add(13.0);
numbers2.add(34.7);
numbers2.add(10.0);
numbers2.add(67.3);
System.out.println("List:"+numbers2);
double number2=numbers2.get(4);
System.out.println("Accessed Element:"+number2);
double removedNumber2=numbers2.remove(1);
System.out.println("Removed Element:"+removedNumber2);
System.out.println("List:"+numbers2);
}
}

