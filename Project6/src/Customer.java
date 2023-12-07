public class Customer {
    private String name; //private fields
    private int age;

    public Customer(String name, int age){ //constructor
        this.name = name; //assign local fields to arguments
        this.age = age;
    }
    public Customer(Customer c){
        new Customer(c.getName(),c.getAge()); //copy constructor
    }
    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String toString(){ //print out the fields
        return name + " " + age;
    }
}
