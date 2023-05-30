package complexsorting;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class StudentApp {
    public static void main (String [] args){

        Student s1 = new Student("Ravi",27,"patna");
        Student s2 = new Student("Nikita",25,"Asansol");
        Student s3 = new Student("Jayshree", 37, "Texas");

        ArrayList<Student> al = new ArrayList<Student>();
        al.add(s1);
        al.add(s2);
        al.add(s3);

        Collections.sort(al);
        System.out.println(al);
    }
}
