package serializationAndDeserialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class serializationExample {
    public static void main (String [] args){
        try{
            Students students = new Students("Nikita",26,"Asansol","Female",99);
            students.display();

            // Making Object Persistance
            System.out.println("Making the object persistant");

            String path = "E://InputOutput//output3.txt";
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(students);
            System.out.println("Object is stored at the loaction "+path);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
