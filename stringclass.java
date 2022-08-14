
// 05 String =>
/*
String is a sequence of characters, for e.g. “Hello” is a string of 5 characters. In java, string is an immutable object which means it is constant and can cannot be changed once it has been created. In this tutorial we will learn about String class and String methods in detail along with many other Java String tutorials.

Creating a String
There are two ways to create a String in Java

 01 String literal
Using new keyword
String literal
In java, Strings can be created like this: Assigning a String literal to a String instance:

String str1 = "Welcome";
String str2 = "Welcome";

02 Using New Keyword
As we saw above that when we tried to assign the same string object to two different literals, compiler only created one object and made both of the literals to point the same object. To overcome that approach we can create strings like this:

String str1 = new String("Welcome");
String str2 = new String("Welcome");

*/

public class stringclass {

  public static void main(String[] args) {
    // create strings
    String first = "Java";
    String second = "Python";
    String third = "JavaScript";

    // print strings
    System.out.println(first); // print Java
    System.out.println(second); // print Python
    System.out.println(third); // print JavaScript

    // create a string using new
    String name = new String("Java String");

    System.out.println(name); // print Java String
  }
}

/*
 * there are some important methods of string class i would highly recommended
 * you all that checkout this article
 * refer link : https://www.crio.do/blog/string-methods-in-java/
 */