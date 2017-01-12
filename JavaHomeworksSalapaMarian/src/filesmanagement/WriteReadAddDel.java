/*
 * Class WriteReadAddDel
 */
package filesmanagement;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * implements the following methods: write in a file, read from file, add to file
 * and delete content of a file
 *
 * @author MMM
 */
public class WriteReadAddDel {



    public static void writeToFile() {
        Scanner userInput;
        userInput = new Scanner(System.in);
        printBorder();
        System.out.println("\n___________write_to_file__________");
        String text, fileNameInput;
        System.out.print("\nInsert file name: ");

        fileNameInput = userInput.next();
        File fileName = new File(fileNameInput);

        try {
            if (fileName.exists()) {
                throw new IOException("File already exists!\n");

            } else {

                System.out.println("Insert text: ");
                userInput = new Scanner(System.in);
                text = userInput.nextLine();
                if (text.length() == 0) {
                    throw new IllegalArgumentException("You did not inserted any text");
                } else {
                    try (PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
                        writer.println(text);
                    } catch (IOException e) {
                        System.out.println("File not created");
                    }
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        zeroToExit();
    }

    public static void readFromFile() {
        Scanner userInput;
        userInput = new Scanner(System.in);
        printBorder();
        System.out.println("\n________copy_text_from_file_______");
        String fileName;
        System.out.print("\nInsert file name: ");
        fileName = userInput.next();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            String textFromFile = sb.toString();

            if (textFromFile.length() > 0) {
                System.out.println("\nContent of file\n----------------------------------\n"
                        + textFromFile + "----------------------------------");
            } else {
                System.out.println("\nNo content to show");
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        zeroToExit();
    }

    public static void addToFile() {
        Scanner userInput;
        userInput = new Scanner(System.in);
        printBorder();
        System.out.println("\n________add_text_to_file__________");
        String text, fileNameInput;
        System.out.print("\nInsert file name: ");

        fileNameInput = MenuChoice.userInput.next();
        File fileName = new File(fileNameInput);

        try {
            if (!fileName.exists()) {
                throw new IOException("File not found!\n");

            } else {
                System.out.println("Insert text: ");
                text = userInput.nextLine();

                if (text.length() == 0) {
                    throw new IllegalArgumentException("You did not inserted any text");
                } else {

                    try (FileWriter fstream = new FileWriter(fileName, true);
                            BufferedWriter out = new BufferedWriter(fstream)) {
                        out.write(text);
                        out.newLine();
                    } catch (FileNotFoundException e) {
                        System.out.println(e.getMessage());
                    }
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        zeroToExit();
    }

    public static void deleteContent() {
        Scanner userInput;
        userInput = new Scanner(System.in);
        
        printBorder();
        System.out.println("\n_________delete_content___________");
        String fileToDeleteName;
        System.out.print("\nInsert file name: ");
        fileToDeleteName = userInput.next();

        try {
            FileInputStream file = new FileInputStream(fileToDeleteName);
            if (!ifFileExists(fileToDeleteName)) {
                throw new IOException("No content!\n");
            } else {

                try (PrintWriter writer = new PrintWriter(fileToDeleteName)) {
                    writer.print("");
                    System.out.println("Content deleted");
                } catch (IOException e) {
                    System.out.println("Content not deleted");
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        zeroToExit();

    }

    public static boolean ifFileExists(String fileName) {
        boolean ifExists = false;
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            ifExists = br.readLine() != null;

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return ifExists;
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
        String exit = MenuChoice.userInput.next();
    }
}
