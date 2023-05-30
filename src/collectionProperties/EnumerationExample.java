package collectionProperties;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationExample {

    // Enumerator is used only with Vector which is legacy class of java 1.0
    public static void main (String args []){

        Vector vector = new Vector();
        vector.add(10);
        vector.add(20);
        vector.add(30);
        vector.add(40);
        vector.add(50);
        vector.add(60);
        vector.add(70);

        System.out.println(vector);
        System.out.println("____________________________________________________");

        // Enumeration is used to acess elements inside the Vector

        Enumeration enumeration = vector.elements();
        while (enumeration.hasMoreElements()==true){
            System.out.println(enumeration.nextElement());
        }
    }
}
