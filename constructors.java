
// 02 Constructors => 

/*
A constructor in Java is a special method that is used to initialize objects. The constructor is called when an object of a class is created. It can be used to set initial values for object attributes. 

In Java, a constructor is a block of codes similar to the method. It is called when an instance of the class is created. At the time of calling the constructor, memory for the object is allocated in the memory. It is a special type of method which is used to initialize the object. Every time an object is created using the new() keyword, at least one constructor is called.
*/

public class constructors {

  public static void main(String[] args) {

     
        Students s1,s2,s3,s4,s5;
     
        s1=new Students(); // example of default constructor
     s1.display();
   s2=new Students("zohaib", 31); // parameterized constructor
     s2.display();
     
        s3=new Students(s2); // constructor with object as argument
     s3.display();   
        

    }
} // main class ends here

// demonstration of constructors

class Students {

  String n;
  int r;

  Students() // default constructor

  {
    n = "abc";
    r = 000;

  }

  Students(String s, int e) // parameterized constructor
  {
    n = s;
    r = e;

  }

  Students(Students s) // constructor which accepts objects as arguments

  {
    this.n = s.n;
    this.r = s.r;
  }

  public void display() {

    System.out.println("name is " + n +  " and  roll number is " + r);
  }
}