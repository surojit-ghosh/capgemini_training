package cap_20_02;

import java.io.FileReader;
import java.io.IOException;

public class FileHandling {

    public static void main(String[] args) throws IOException {

        // for(int i=1;i<5;i++){
        //     File file = new File("D:\\Capgemini Training\\Class_Training\\src\\file\\handling" + i);
        //     System.out.println("file created");
        // }

        // FileWriter fileWriter = new FileWriter("samlpeee.txt");
        // fileWriter.write("hellooo world......");

        FileReader fileReader = new FileReader("samlpeee.txt");

        int ch;

        while ((ch = fileReader.read()) != -1) {
            System.out.print((char) ch);
        }

        fileReader.close();

        System.out.println("done");
    }
}