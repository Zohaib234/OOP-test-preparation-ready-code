
// 03 Aggregation ==>
/*
When an object A contains a reference to another object B or we can say Object A has a HAS-A relationship with Object B, then it is termed as Aggregation.

Aggregation helps in reusing the code. Object B can have utility methods and which can be utilized by multiple objects. Whichever class has object B then it can utilize its methods
*/

// real life demonstration of aggregation

public class aggregation {

  public static void main(String[] args) {  
    
Address address1=new Address("Jamshoro ","Sindh","Pakistan");  
Address address2=new Address("Badin","Sindh","Pakistan");
Address address3=new Address("Dadu","Sindh","Pakistan");
Emp e=new Emp(18,"Zulfiqar",address1);  
Emp e2=new Emp(31,"Zohaib",address2);
Emp e3=new Emp(80,"Ali",address3);
      
e.display();  
e2.display();  
e3.display();
      
}
  
  
}
// address class
class Address {  
String city,state,country;  
  
public Address(String city, String state, String country) {  
    this.city = city;  
    this.state = state;  
    this.country = country;  
}  
  
}  

// Employe class which has a relation with address class

 class Emp {  
int id;  
String name;  
Address address;  
  
public Emp(int id, String name,Address address) {  
    this.id = id;  
    this.name = name;  
    this.address=address;  
}  
  
void display(){  
System.out.println(id+" "+name);  
System.out.println(address.city+" "+address.state+" "+address.country);  
}
 }