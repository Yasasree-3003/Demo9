import java.util.ArrayList;
class Main4
{
public static void main(String args[])
{
ArrayList<String>languages=new ArrayList<>();
languages.add("Java");
languages.add("Python");
languages.add("c++");
languages.add("Kotlin");
languages.add("Html");
System.out.println("ArrayList:"+languages);
languages.set(1,"JavaScript");
System.out.println("Modified ArrayList:"+languages+"\n");

ArrayList<Integer>number=new ArrayList<>();
number.add(34);
number.add(21);
number.add(1);
number.add(45);
number.add(13);
System.out.println("ArrayList:"+number);
number.set(1,10);
System.out.println("Modified ArrayList:"+number+"\n");

ArrayList<Double>number1=new ArrayList<>();
number1.add(3.0);
number1.add(2.1);
number1.add(1.0);
number1.add(4.54);
number1.add(1.30);
System.out.println("ArrayList:"+number1);
number1.set(3,1.5);
System.out.println("Modified ArrayList:"+number1);
}
}