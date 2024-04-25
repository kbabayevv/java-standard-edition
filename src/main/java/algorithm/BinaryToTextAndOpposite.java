package algorithm;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BinaryToTextAndOpposite {
    public static void main(String[] args) {

        while (true) {
            System.out.println("1. Convert Binary to Text: ");
            System.out.println("2. Convert Text to Binary: ");
            System.out.println("3. Exit: ");
            Scanner sc = new Scanner(System.in);
            int menu = sc.nextInt();

            switch (menu) {
                case 1 -> {
                    System.out.println("Enter Binary: ");
                    sc = new Scanner(System.in);
                    convertBinaryToText(sc.nextLine());
                }
                case 2 -> {
                    System.out.println("Enter Text: ");
                    sc = new Scanner(System.in);
                    convertTextToBinary(sc.nextLine());
                }
                case 3 -> System.exit(0);
            }


        }

    }

    public static void convertBinaryToText(String number) {
        String[] split = number.split(" ");
        String text = "";
        int key = 0;
        for (String s : split) {
            key = 0; // Reset key for each binary number
            for (int j = 0; j < s.length(); j++) {
                key += (int) (Integer.parseInt(String.valueOf(s.charAt(j))) * Math.pow(2, s.length() - 1 - j));
            }
            text = text.concat(String.valueOf(MockAsciiTable.asciiTable.get(key)));
        }
        System.out.println(text);
    }

    public static void convertTextToBinary(String text) {
        StringBuilder binary = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            boolean found = false;
            for (Map.Entry<Integer, Character> entry : MockAsciiTable.asciiTable.entrySet()) {
                if (entry.getKey() == c) {
                    found = true;
                    int asciiValue = entry.getValue();
                    while (asciiValue > 0) {
                        binary.append(asciiValue % 2);
                        asciiValue /= 2;
                    }
                    while (binary.length() % 8 != 0) {
                        binary.append("0");
                    }
                    binary.append(" "); // Separate binary numbers by space
                    break;
                }
            }
            if (!found) {
                System.out.println("Character '" + c + "' does not have an ASCII representation in the MockAsciiTable.");
            }
        }
        // Reversing the binary string by bytes (8 bits each)
        String[] bytes = binary.toString().trim().split(" ");
        binary.setLength(0); // Clearing the StringBuilder
        for (String byteStr : bytes) {
            StringBuilder reversedByte = new StringBuilder(byteStr).reverse();
            binary.append(reversedByte).append(" ");
        }
        System.out.println(binary.toString().trim());
    }
}

class MockAsciiTable {
    public static Map<Integer, Character> asciiTable = new HashMap<>();

    static {
        for (int i = 0; i < 128; i++) {
            asciiTable.put(i, (char) i);
        }
    }
}