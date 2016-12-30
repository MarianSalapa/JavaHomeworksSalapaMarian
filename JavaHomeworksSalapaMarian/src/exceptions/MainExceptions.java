/*
 * 
 */
package exceptions;


import java.io.*;


/**
 *
 * @author MMM
 */
public class MainExceptions {

    public static void main(String[] args) {
        try {
            readFirstLineFile("text.txt");
        } catch (IOException e) {
            System.out.println("Cannot read first line for text.txt:");
        }

        try {
            readFirstLineTryWithResources("text.txt");
        } catch (IOException e) {
            System.out.println("Cannot read first line for text.txt:");
        }
        try {
            System.out.println("Circle area is " + circleArea(10.5));
        } catch (Exception e) {
            System.out.println("Cannot calculate area: " + e.getMessage());
        }

        try {
            int age = ValidationException.parseAge("23");
        } catch (ValidationException e) {
            System.out.println("Invalid age argument: " + e.getMessage());
        }

        if (verifyCnp("1860624197452")) {
            System.out.println("cnp-ul este corect");
        }
        ContactRepository repo = new ContactRepository("B:\\Java\\Scoala IIT\\file.csv");
        repo.saveContact("Adrian", "123");
        
        
    
    }

    public static void readFirstLineFile(String fileName) throws IOException {
        BufferedReader r = new BufferedReader(new FileReader("text.txt"));
        try {
            String firstLine = r.readLine();

        } catch (IOException e) {
            System.out.println("Cannot read first line for text.txt:");

        } finally {
            r.close();
        }
    }

    public static void readFirstLineTryWithResources(String fileName) throws IOException {
        try (BufferedReader r = new BufferedReader(new FileReader("text.txt"))) {
            String firstLine = r.readLine();

        } catch (IOException e) {
            System.out.println("Cannot read first line for text.txt:");

        }
    }

    static double circleArea(double radius) throws Exception {
        if (radius < 0) {
            throw new Exception("radius should be positive");
        }
        return Math.PI * radius * radius;
    }

    static boolean verifyCnp(String cnp) {
        if (cnp == null || cnp.length() != 13) {
            throw new IllegalArgumentException("cnp should be exactly 13 digits long");
        }
        char s = cnp.charAt(0);
        return true;
    }
}
