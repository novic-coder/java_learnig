package Maps;

import java.util.HashMap;

public class HashMapEx1 {

    public static void main (String [] args){

        // Creating object for Student class

        Student s1 = new Student("Ravi",2,"Patna", "Male", "ravikumar@gmail.com",80,700429083);
        Student s2 = new Student("Nikita",26,"Asansol","Female","niitaruje@gmail.com",90,8240222);
        Student s3 = new Student("Soni",24,"Patna","Female","sulekha@gmail.com",81,90839993);

        // Creating HashMap and storing student object using Key

        HashMap hm = new HashMap();
        hm.put(991,s1);
        hm.put(992,s2);
        hm.put(993,s3);
        System.out.println(hm);
    }
}
