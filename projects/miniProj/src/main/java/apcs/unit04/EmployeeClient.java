package apcs.unit04;

public class EmployeeClient {
    
    public static void main(String[] args){
        System.out.println(Employee.getEmployeeCount());
        Employee e = new Employee("Dan");
        Employee e2 = new Employee("Vijay","CEO",100);
        //e is an INSTANCE of type Employee
        
        System.out.println(e2.getName());
        System.out.println(e2.getPosition());
        System.out.println(e2.getSalary());
        System.out.println(Employee.getEmployeeCount());

        e.setPosition("Teacher");
        e.setSalary(60000);
        System.out.println(e);
        


    }
}


