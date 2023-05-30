package UseCase2;

import Usecase1.Employee2;

import java.util.*;

public class Operations {
    public static void main (String [] args) throws InvalidEntry,InvalidSearch,InvalidUpdate {
        List<Employee> employee_collection = new ArrayList<Employee>();
        Scanner scan = new Scanner(System.in);
        Scanner scan1 = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. INSERT");
            System.out.println("2. DISPLAY");
            System.out.println("3. SEARCH");
            System.out.println("4. DELETE");
            System.out.println("5. UPDATE");
            System.out.println("Enter your Choice ");
            choice = scan.nextInt();

            switch (choice){
                case 1:
                    System.out.print("Please Enter the employee no");
                    int empno = scan.nextInt();
                    System.out.print("Please enter Employee Name");
                    String ename = scan1.nextLine();
                    System.out.print("Enter Employee age");
                    int empage = scan.nextInt();
                    System.out.print("Please enter the salary");
                    double esalary = scan.nextDouble();
                    employee_collection.add(new Employee(empno, ename, empage, esalary));
                    break;

                case 2:
                    System.out.println("------------------------------");
                    Iterator<Employee> i = employee_collection.iterator();
                    while (i.hasNext()) {
                        Employee emp1 = i.next();
                        System.out.println(emp1);
                    }
                    System.out.println("--------------------------------");
                    break;

                case 3:
                    boolean found = false;
                    System.out.println("Please enter the Employee number to search");
                    int employee_no = scan.nextInt();
                    System.out.println("-------------------------------------");
                    i = employee_collection.iterator();
                    while (i.hasNext()){
                        Employee emp1 = i.next();
                        if (emp1.getEmployee_no() != employee_no){
                            InvalidSearch invalidSearch = new InvalidSearch();
                            invalidSearch.getMessage();
                            throw invalidSearch;
                        }
                        else {
                            System.out.println(emp1);
                            found = true;
                        }
                    }
                    break;
                case 4:
                    found = false;
                    System.out.println("Please enter the employee no to delete");
                    employee_no = scan.nextInt();
                    System.out.println("-------------------------------------");
                    i = employee_collection.iterator();
                    while (i.hasNext()){
                        Employee emp2 = i.next();
                        if (emp2.getEmployee_no() == employee_no){
                            i.remove();
                            found = true;
                        }
                        else {
                            InvalidEntry invalidEntry = new InvalidEntry();
                            invalidEntry.getMessage();
                            throw invalidEntry;
                        }
                        System.out.println("Record deleted Successfully");
                    }
                    break;
                case 5:
                    found = false;
                    System.out.println("Please enter the employee no for update");
                    employee_no = scan.nextInt();
                    System.out.println("-------------------");
                    ListIterator<Employee> li = employee_collection.listIterator();
                    while (li.hasNext()){
                        Employee emp = li.next();
                        if (emp.getEmployee_no() == employee_no){
                            System.out.println("Enter the new name");
                            ename = scan1.nextLine();

                            System.out.println("Enter the new age");
                            empage = scan.nextInt();

                            System.out.println("Enter the new salary");
                            esalary = scan.nextDouble();

                            li.set(new Employee(employee_no,ename,empage,esalary));
                            found = true;
                        }
                        else {
                            InvalidUpdate invalidUpdate = new InvalidUpdate();
                            invalidUpdate.getMessage();
                            throw invalidUpdate;
                        }
                    }
                    break;
            }
        }while (choice !=0);
    }
}
