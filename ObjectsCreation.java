
class Employee {
    int id;
    String name;
    int salary;

    public void printDetails() {
        System.out.println("ID is: " + id);
        System.out.println("Name is: " + name);
    }

    public int getSalary() {
        return salary;
    }
}

public class ObjectsCreation {
    public static void main(String[] args) {
        Employee zahid = new Employee();

        //setting attributes for zahid Employee
        zahid.id = 1;
        zahid.name = "ZAHID";
        zahid.salary = 34;
        
        Employee umair = new Employee();

        //setting attributes for umair Employee
        umair.id = 2;
        umair.name = "UMAIR";
        umair.salary = 23;

        zahid.printDetails();
        umair.printDetails();
        int salary = zahid.getSalary();
        System.out.println("Salary of " + zahid.name + " is: " + salary);
    }
}
