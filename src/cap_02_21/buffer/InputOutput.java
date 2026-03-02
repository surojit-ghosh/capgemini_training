package cap_02_21.buffer;

import java.io.*;

public class InputOutput {
    public static void main(String[] args) throws IOException {
//        FileWriter fileWriter = new FileWriter("output.txt");
//        BufferedWriter writer = new BufferedWriter(fileWriter);
//
//        writer.write("Hello, World!");
//        writer.newLine();
//        writer.write("This is a sample text file.");
//        writer.close();

//        FileReader fileReader = new FileReader("output.txt");
//        BufferedReader reader = new BufferedReader(fileReader);
//
//        String string;
//
//        while((string = reader.readLine()) != null) {
//            System.out.println(string);
//        }
//
//        reader.close();

        ReadAndWrite readAndWrite = new ReadAndWrite();
        Thread thread1 = new Thread(() -> {
            try {
                readAndWrite.readData();
            } catch (IOException | InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        Thread thread2 = new Thread(() -> {
            try {
                readAndWrite.writeData();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });

        thread1.start();
        thread2.start();
    }
}

class ReadAndWrite {
    private String data = "Initial Data";
    private boolean isDataWritten = false;

    public synchronized void readData() throws IOException, InterruptedException {
        if (!isDataWritten) {
            System.out.println("Data is not written yet. Waiting...");
            wait();
        }

        FileReader reader = new FileReader(data);
        BufferedReader bufferedReader = new BufferedReader(reader);

        String line;

        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
    }

    public synchronized void writeData() throws IOException {
        FileWriter writer = new FileWriter(data);
        BufferedWriter bufferedWriter = new BufferedWriter(writer);

        bufferedWriter.write("Hello, World!");
        bufferedWriter.newLine();
        bufferedWriter.write("This is a sample text file.");
        bufferedWriter.close();

        isDataWritten = true;
        System.out.println("Data has been written. Notifying reader...");
        notify();
    }
}
