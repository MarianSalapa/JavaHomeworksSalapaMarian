/*
 * Class WriteReadAddDel
 */
package filesmanagement;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * implements the following methods write in a file, read from file, add to file
 * and delete content of a file
 *
 * @author MMM
 */
public class WriteReadAddDel {

    private static Scanner x;

    public static void writeToFile() {
        printBorder();
        System.out.println("\n___________write_to_file__________");
        String text, fileName;
        System.out.print("\nInsert file name: ");
        fileName = FilesManagement.userInput.next();
        System.out.print("Insert text: ");
        text = FilesManagement.userInput.next();

        try {
            try (PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
                writer.println(text);
            }
        } catch (IOException e) {
            System.out.println("File not created");
        }
        zeroToExit();
    }

    public static void readFromFile() throws FileNotFoundException, IOException {
        printBorder();
        System.out.println("\n________copy_text_from_file_______");
        String fileName;
        System.out.print("\nInsert file name: ");
        fileName = FilesManagement.userInput.next();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            String textFromFile = sb.toString();
            System.out.println("\nContent of file\n----------------------------------\n"
                    +textFromFile+"----------------------------------");
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }

        zeroToExit();
    }

    public static void addToFile() throws IOException {
        printBorder();
        System.out.println("\n________add_text_to_file__________");
        String text, fileName;
        System.out.print("\nInsert file name: ");
        fileName = FilesManagement.userInput.next();
        System.out.print("Insert text: ");
        text = FilesManagement.userInput.next();

        try (FileWriter fstream = new FileWriter(fileName, true);
                BufferedWriter out = new BufferedWriter(fstream)) {
            out.write(text);
            out.newLine();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }

        zeroToExit();
    }

    public static void deleteContent() throws IOException {
        printBorder();
        System.out.println("\n_________delete_content___________");
        String fileToDeleteName;
        System.out.print("\nInsert file name: ");
        fileToDeleteName = FilesManagement.userInput.next();

        try {
            FileInputStream file = new FileInputStream(fileToDeleteName);
            try (PrintWriter writer = new PrintWriter(fileToDeleteName)) {
                writer.print("");
                System.out.println("Content deleted");
            } catch (IOException e) {
                System.out.println("Content not deleted");
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
           
            zeroToExit();
        }
    }
    

    public static void printMenu() {
        System.out.print("\n__Menu___________________________"
                + "\n|Choose operation:              |"
                + "\n|   write file________________1 |"
                + "\n|   copy text from file_______2 |"
                + "\n|   add text to file__________3 |"
                + "\n|   delete content from file__4 |"
                + "\n|   to exit___________________0 |"
        );
    }

    public static void printBorder() {
        System.out.print("\n==================================");

    }

    public static void zeroToExit() {
        System.out.print("\nType 0 to get back to the menu: ");
        String exit = FilesManagement.userInput.next();
    }
}
