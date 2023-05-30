package genericConcept;

import java.util.ArrayList;

public class ExampleOne {

    public static void main (String [] args){

        ArrayList<Student> arrayList = new ArrayList<Student>();
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        arrayList.add(s1);
        arrayList.add(s2);
        arrayList.add(s3);

        System.out.println(arrayList);
    }
}
