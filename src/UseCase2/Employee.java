package UseCase2;

public class Employee {
    private int employee_no;
    private  String employee_name;
    private int age;
    private double salary;

    Employee(int employee_no, String employee_name, int age, double salary)
    {
        this.employee_no  = employee_no;
        this.employee_name = employee_name;
        this.age = age;
        this.salary = salary;
    }
    public int getEmployee_no(){
        return employee_no;
    }

    public String getEmployee_name() {
        return employee_name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public String toString(){
        return employee_no+" "+employee_name+" "+age+ " "+ salary;
    }

}
