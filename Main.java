class Main {
  public static void main(String[] args) {

   // 01 => Method Overloading 
    /*
    In Java, two or more methods may have the same name if they 
    differ in parameters (different number of parameters, different 
   types of parameters, or both). These methods are called 
   overloaded methods and this feature is called method overloading.

    example:

    void func() { ... }
    void func(int a) { ... }
    float func(double a) { ... }
    float func(int a, float b) { ... }

   Here, the func() method is overloaded. These methods have the 
   same name but accept different arguments.
*/
  // by changing number of parameters
MethodOverloading overloading = new MethodOverloading();

      System.out.println("by changing number of parameters");
    overloading.display(3);
    overloading.display(3, 4);

    // by changing data types of parameters
    MethodOverloading_by_data_type param = new 
    MethodOverloading_by_data_type();
      System.out.println("by changing data types of parameters");
    param.display(31);          // accepts integer value
    param.display("Zohaib");    // accepts string values
    
    
  }
}  // main class ends here


   //   1. Overloading by changing the number of parameters
class MethodOverloading {
    public  void display(int a){
        System.out.println("Arguments: " + a);
    }

    public   void display(int a, int b){
        System.out.println("Arguments: " + a + " and " + b);
    }
}

// method overloading by changing data type of parameters
class MethodOverloading_by_data_type {

    // this method accepts int
    public void display(int a){
        System.out.println("Got Integer data.");
    }

    // this method  accepts String object
    public  void display(String a){
        System.out.println("Got String object.");
    }
}
