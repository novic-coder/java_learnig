package HashCodes;

import java.util.HashMap;

public class StudentApp {

    public static void main (String [] args){

        Students s1 = new Students("Ravi",25,"Male",90);
        Students s2 = new Students("Nikita",24,"Female",99);
        Students s3 = new Students("Jayshree", 34, "Female",99);


        HashMap<Integer,Students> hashMap = new HashMap<Integer,Students>();
        hashMap.put(100,s1);
        hashMap.put(101,s2);
        hashMap.put(102,s3);

        System.out.println(hashMap);
    }
}
