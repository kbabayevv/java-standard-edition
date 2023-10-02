package file;

import java.io.*;
import java.util.Scanner;

public class FileExample {
    public static void main(String[] args) throws IOException {
        FileExample fileExample = new FileExample();
        File file = new File("data.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        fileExample.writeToFile(file, true);
        fileExample.readFile(file);

    }

    public void writeToFile(File file, boolean append) throws IOException {
        FileWriter fileWriter = new FileWriter(file, append);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text for writing to file");
        String text = sc.nextLine();

        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.append("\n" + text);
        bufferedWriter.close();
    }

    public void readFile(File file) throws IOException {
        FileReader fileReader = new FileReader(file);

        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line = "";
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
    }
}
