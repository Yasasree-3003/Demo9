import java.util.List;
import java.util.ArrayList;
class Main3
{
public static void main(String args[])
{
List<Integer>numbers=new ArrayList<>();
numbers.add(17);
numbers.add(22);
numbers.add(33);
numbers.add(67);
numbers.add(25);
numbers.add(67);
numbers.add(89);
numbers.add(12);
numbers.add(54);
numbers.add(13);
System.out.println("List:"+numbers);
int number=numbers.get(2);
System.out.println("Accessed Element:"+number);
int index=numbers.indexOf(33);
System.out.println("Position of 33 is"+" "+index);
int removedNumber=numbers.remove(1);
System.out.println("Removed Element:"+removedNumber+"\n");
//System.out.println("List:"+numbers+"\n");

List<String>numbers1=new ArrayList<>();
numbers1.add("Dog");
numbers1.add("Horse");
numbers1.add("Lion");
numbers1.add("Tiger");
numbers1.add("Monkey");
numbers1.add("Donkey");
numbers1.add("Cow");
numbers1.add("Goat");
numbers1.add("Elephant");
numbers1.add("Sheep");

System.out.println("List:"+numbers1);
String number1=numbers1.get(3);
System.out.println("Accessed Element:"+number1);
index=numbers1.indexOf("Horse");
System.out.println("Position of Horse is"+" "+index);
String removedNumber1=numbers1.remove(4);
System.out.println("Removed Animal:"+removedNumber1+"\n");

List<Double>numbers2=new ArrayList<>();
numbers2.add(45.9);
numbers2.add(13.0);
numbers2.add(34.7);
numbers2.add(10.0);
numbers2.add(6.7);
numbers2.add(69.0);
numbers2.add(45.0);
numbers2.add(21.3);
numbers2.add(34.1);
numbers2.add(9.3);
System.out.println("List:"+numbers2);
double number2=numbers2.get(4);
System.out.println("Accessed Element:"+number2);
index=numbers2.indexOf(34.7);
System.out.println("Position of 34.7 is"+" "+index);
double removedNumber2=numbers2.remove(1);
System.out.println("Removed Number:"+removedNumber2);
}
}