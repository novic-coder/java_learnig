package input_output;

import java.io.FileReader;
import java.io.FileWriter;

public class InputOutputExample2 {

    public static  void main (String [] args ){
        try{
            String path1 = "E://InputOutput//input1.txt";
            String path2 = "E://InputOutput//output1.txt";

            FileReader fileReader = new FileReader(path1);
            FileWriter fileWriter = new FileWriter(path2);
            int help;

            while ((help = fileReader.read()) != -1){
                fileWriter.write(help);
            }
            fileWriter.flush();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
