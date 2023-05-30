package complexsorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentApp2 {
    public static void main(String[] args) {
        ArrayList<Student2> arrayList = new ArrayList<Student2>();
        Student2 s1 = new Student2("Ravi", 27, 89);
        Student2 s2 = new Student2("Nikita", 25, 90);
        Student2 s3 = new Student2("Jayshree", 34, 99);

        arrayList.add(s1);
        arrayList.add(s2);
        arrayList.add(s3);

        System.out.println(arrayList);

        // Implementation of alpha class that is inner class using interface comparator
        class Alpha1 implements Comparator {
            @Override
            public int compare(Object x, Object y) {
                if (((Student2) (x)).age > ((Student2) (y)).age) {
                    return 1;
                } else {
                    return -1;
                }


            }

        }

        Alpha1 alpha1 = new Alpha1();
        // Use overloaded sort method to sort the student object
        Collections.sort(arrayList,alpha1);
        System.out.println(arrayList);
    }
}
