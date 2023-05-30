package input_output;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class InputOutputExample {

    public static void main (String [] args){

        try{
            String path1 = "E://InputOutput//input1.txt";
            String path2 = "E://InputOutput//output.txt";

            FileInputStream fis = new FileInputStream(path1);
            FileOutputStream fos = new FileOutputStream(path2);

            int help;
            while ((help = fis.read()) != -1){
                fos.write(help);
            }

        }

        catch (Exception e){
            e.printStackTrace();
        }
    }
}
