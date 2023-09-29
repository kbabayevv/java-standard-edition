package file;

import java.io.*;

public class Files {
    public static void main(String[] args) throws IOException {

        String[] names = {"Kamran", "Zaur", "Qamet", "Nihad", "Vasif", "Elmeddin"};
        BufferedWriter writer = new BufferedWriter(new FileWriter("file.txt"));

        for (String name : names) {
            writer.append(name);
            writer.append("\nJava");
        }
        writer.close();

        BufferedReader reader = new BufferedReader(new FileReader("file.txt"));

        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
    }
}
