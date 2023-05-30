package complexsorting;

import java.util.ArrayList;
import java.util.Collections;


public class StudentApp1 {
    public static void main (String [] args){
        Student1 s1 = new Student1("Ravi",27,"Patna");
        Student1 s2 = new Student1("Nikita",25,"Asansol");
        Student1 s3 = new Student1("Anushree",36,"Texas");


        ArrayList<Student1> al = new ArrayList<Student1>();
        al.add(s1);
        al.add(s2);
        al.add(s3);

        Alpha alpha = new Alpha();
        Collections.sort(al,alpha);
        System.out.println(al);

        NameComparator nameComparator = new NameComparator();
        Collections.sort(al,nameComparator);
        System.out.println(al);
    }


}
