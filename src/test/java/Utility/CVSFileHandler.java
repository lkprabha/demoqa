package Utility;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CVSFileHandler {
        public static String[] csvDataRead(String CSV_PATH, int columnCount) throws IOException {
        //String CSV_PATHA ="C:/Users/Praba/projects/demoqa/src/test/Resources/Data/RegistrationData.csv";
        System.out.println("inside CSVHandler");
        System.out.println(CSV_PATH);

        String line = "";
        String values[] = new String[columnCount];

        try {
         //   System.out.println(CSV_PATH);
            BufferedReader br;
            br = new BufferedReader(new FileReader(CSV_PATH));
            while((line=br.readLine()) != null) {
              System.out.println(line);
              values = line.split(",");
              System.out.println(values[0]);
            }

        } catch(FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("final output");
        System.out.println(values);
        return values;
    }
}
