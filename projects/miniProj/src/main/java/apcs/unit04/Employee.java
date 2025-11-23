package apcs.unit04;

//object, reference type, instance of a class type
public class Employee {
    // instance data
    private String name;
    private String position;
    private double salary;

    public static final String COMPANY = "North Allegheny";
    private static int employeeCount=0;

    public Employee(String name) {
        this.name = name; // here, i have to use "this." to decern between instance data and parameter
        this.position = "Generic";
        this.salary = 0;
        employeeCount++;
    }
    public Employee(String name, String position, double salary){
        this.name = name;
        this.position = position;
        
        if(salary<0){
            throw new IllegalArgumentException();
        }else{
            this.salary = salary;
        }
        employeeCount++;

    }
    public static int getEmployeeCount(){
        return employeeCount;
    } 

    public String getName() {
        return this.name;
    }

    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }
    //mutators (setters)
    public void setPosition(String position){
        this.position = position;
    }
    public void setSalary(double salary){
        if (salary<0){
            throw new IllegalArgumentException();
        }
        this.salary = salary;
    }
    public String toString(){
        return name + "\nPosition: " + position;
    }
}

// instance: specific occurance of a class
/*
 * "this" refers to the calling object
 * class - a blueprint for how an Object of this type will work
 * 
 * 1. attributes (characteristics/instance data)
 * 2. constructor(s) - special methods that allow the user to instantiate
 * (create)
 * an object of this type
 * 3. other functions - accessors (getters) and mutators (setters)
 * 
 * ATTRIBUTES
 * private - accessible directly (using the dot operator) only in this class
 * protected - accessible directly inside this class, in any direct subclasses
 * of this class
 * and in any class in the same package as this class
 * public - accessible directly from any class
 * 
 * instance data should be private (unless you have a good reason to make it
 * protected)
 * instance data should never be public (only class constants should be public)
 * 
 * CONSTRUCTORS
 * the job of a constructor is to initialize instance data
 * 
 * if you don't define any constructors, the JRE will provide the default
 * constructor
 * as soon as you define a constructor, the default is no longer provided
 * 
 * if you don't initialize primitive instance data, the JRE will provide default
 * values for that data only
 * 
 * default constructor - empty parameter list - initializes instance data to
 * default values
 * 
 * if no values are given to instance data that is primitive, the JRE will
 * automatically
 * give that data default values
 * 
 * OTHER FUNCTIONS
 * accessors - functions that allow the client to access the value(s) of
 * instance data
 * mutators - functions that allow the client to change the value(s) of instance
 * data
 * but on our terms
 */
