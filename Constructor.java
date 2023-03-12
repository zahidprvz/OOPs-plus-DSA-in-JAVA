class EmployeeM {
    private long salary;

    public EmployeeM() {    //Constructor
        salary = 10000;
    }

    public EmployeeM(long n) {  //Constructor overloading
        salary = n;
    } 

    public long getSalary() {
        return salary;
    }
}

public class Constructor {
    public static void main(String[] args) {
        EmployeeM em = new EmployeeM(3500);

        System.out.println(em.getSalary());
    }
}
