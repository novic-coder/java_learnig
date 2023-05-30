package input_output;

import java.io.File;

public class FileInbuiltMethods {
    public static void main (String [] args){
        try{
            String path2 = "E://InputOutput//input1.txt";

            File file = new File(path2);

            System.out.println(file.canRead());
            System.out.println(file.canWrite());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.getParent());
            System.out.println(file.getName());
            System.out.println(file.getCanonicalFile());

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
