package input_output;

import java.io.File;

public class FileChecking {
    public static void main (String args [] ) {
        try {
            String path = "h://InputOutput//input1.txt";
            File file = new File(path);
            if (file.exists()){
                if (file.isFile()){
                    System.out.println("Path Contains a file");
                }
                else {
                    System.out.println("Path Does not contains file");
                }

            }
            else {
                System.out.println("Invalid Path");
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
