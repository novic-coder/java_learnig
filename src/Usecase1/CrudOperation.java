package Usecase1;

import java.util.*;

public class CrudOperation {
    public static void main(String[] args) {

        List<Employee2> coll = new ArrayList<Employee2>();
        Scanner scan = new Scanner(System.in);
        Scanner scan1 = new Scanner(System.in);
        int ch;
        do {
            System.out.println("1. INSERT");
            System.out.println("2. DISPLAY");
            System.out.println("3. SEARCH");
            System.out.println("4. DELETE");
            System.out.println("5. UPDATE");
            System.out.println("Enter your Choice ");
            ch = scan.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Please Enter the employee no");
                    int empno = scan.nextInt();
                    System.out.print("Please enter Employee Name");
                    String ename = scan1.nextLine();
                    System.out.print("Enter Employee age");
                    int empage = scan.nextInt();
                    System.out.print("Please enter the salary");
                    double esalary = scan.nextDouble();

                    coll.add(new Employee2(empno, ename, empage, esalary));
                    break;
                case 2:
                    System.out.println("------------------------------");
                    Iterator<Employee2> i = coll.iterator();
                    while (i.hasNext()) {
                        Employee2 emp2 = i.next();
                        System.out.println(emp2);
                    }
                    System.out.println("--------------------------------");
                    break;

                case 3:
                    boolean found = false;
                    System.out.println("Please enter the employee no");
                    empno = scan.nextInt();
                    System.out.println("--------------------------------");
                    i = coll.iterator();
                    while (i.hasNext()) {
                        Employee2 emp = i.next();
                        if (emp.getEmployee_no() == empno) {
                            System.out.println(emp);
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("Record not found");
                    }
                    System.out.println("-----------------------------------");
                break;

                case 4:
                     found = false;
                    System.out.println("Please enter the employee no to delete");
                    empno = scan.nextInt();
                    System.out.println("--------------------------------");
                    i = coll.iterator();
                    while (i.hasNext()) {
                        Employee2 emp = i.next();
                        if (emp.getEmployee_no() == empno) {
                            i.remove();
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("Record not found");
                    }
                    else {
                        System.out.println("Record is deleted successfully");
                    }
                    System.out.println("-----------------------------------");
                    break;
                    case 5:
                        found = false;
                        System.out.println("Please enter the employee no to Update");
                        empno = scan.nextInt();
                        System.out.println("--------------------------------");
                        ListIterator<Employee2> li = coll.listIterator();
                        while (li.hasNext()) {
                            Employee2 emp = li.next();
                            if (emp.getEmployee_no() == empno) {
                                System.out.println("Enter the new name");
                                ename = scan1.nextLine();

                                System.out.println("Enter the age");
                                empage = scan.nextInt();

                                System.out.println("Enter the new salary");
                                esalary = scan.nextDouble();
                                li.set(new Employee2(empno,ename,empage,esalary));
                                found = true;
                            }
                        }
                        if (!found) {
                            System.out.println("Record not found");
                        }
                        else {
                            System.out.println("Record is deleted successfully");
                        }
                        System.out.println("-----------------------------------");
                        break;


                }

        } while (ch != 0);
    }
}
