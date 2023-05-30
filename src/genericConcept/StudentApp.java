package genericConcept;

import java.util.ArrayList;

public class StudentApp {

    public static void main (String [] args){
        ArrayList<Student1> arrayList = new ArrayList<Student1>();
        Student1 student1 = new Student1("Ravi",26,"Patna");
        Student1 student2 = new Student1("Nikita",25,"Asansol");
        Student1 student3 = new Student1("Jayshree",34,"Husdon");
        arrayList.add(student1);
        arrayList.add(student2);
        arrayList.add(student3);
        System.out.println(arrayList);
    }
}
