package input_output;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class InputOutputExample3 {

    public static void main (String [] args){

        // To increase efficiency we will use buffer reader with file reader

        String help;

        FileReader fileReader = null;
        FileWriter fileWriter =  null;
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;

        try{
            String path1 = "E://InputOutput//input2.txt";
            String path2 = "E://InputOutput//output2.txt";

            fileReader = new FileReader(path1);
            fileWriter = new FileWriter(path2);

            bufferedReader = new BufferedReader(fileReader);
            bufferedWriter = new BufferedWriter(fileWriter);

            while ((help = bufferedReader.readLine()) != null){
                bufferedWriter.write(help);
            }
            bufferedWriter.flush();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            try{
                // Important resources are open so we need to close them
                fileReader.close();
                fileWriter.close();
                bufferedReader.close();
                bufferedWriter.close();
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
