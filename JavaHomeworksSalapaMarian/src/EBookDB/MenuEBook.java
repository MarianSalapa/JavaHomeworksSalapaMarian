/*
 * eBook Menu class
 */
package EBookDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 * implements methods of the eBook menu
 *
 * @author MMM
 */
public class MenuEBook {

    static Scanner userInput = new Scanner(System.in);

    public static void printMenu() {
        String menu1Text = "\n_______________eBook_Menu_______________"
                + "\n| Add eBook__________________1         |"
                + "\n| List eBook_________________2         |"
                + "\n| Delete eBook_______________3         |"
                + "\n| New Author_________________4         |"
                + "\n| Author's list______________5         |"
                + "\n| Rate a eBook_______________6         |"
                + "\n| Create tables______________7         |"
                + "\n| To exit press______________0         |"
                + "\n| your choice________";
        System.out.print(menu1Text);
    }

    public static void addEBook() {
        String title, name, surname, codeISBN;
        int authorID;
        int noOfPages=0;
        int price, rating;

        System.out.print("----------------------------------------\n"
                + "_________Add new eBook________"
                + "\nInsert title: ");
        title = userInput.next();

        System.out.print("Insert codeISBN: ");
        codeISBN = userInput.next();

        System.out.print("Insert author's name:");
        name = userInput.next();
        System.out.print("Insert author's surname:");
        surname = userInput.next();

        authorID=checkAutor(name, surname);
        if (authorID!=0) {
            
            System.out.print("Insert price:");
            try {
                price = userInput.nextInt();
            } catch (InputMismatchException e2) {
                System.out.println("Invalid value! Price set to 0");
                price = 0;
            }
            System.out.print("Insert rating (1 to 5):");
            try {
                rating = userInput.nextInt();
            } catch (InputMismatchException e3) {
                System.out.println("Invalid value! Rating set to 2");
                rating = 2;
            }
            if (!(rating >= 1) || !(rating <= 5)) {
                System.out.println("Invalid value! Rating set to 2");
                rating = 2;
            } else {

                EBook newEBook = new EBook(title,  price, rating, codeISBN);
                
                String q1="INSERT INTO EBOOK (ISBN, TITLE,PRICE, RATING,NOOFRATINGS,AUTHOR_ID)VALUES ('"+codeISBN+"','"+title+"',"+price+","+rating+","+newEBook.getNoOfRatings()+","+authorID+")";
                String text1="Book " + title + " added";
                SQLQuery.SimpleQuery(q1, text1);
            }
          
        } else {
            System.out.println("Invalid author");
        }
        zeroToExit();
    }

    public static void printEBookList() {

        System.out.print("----------------------------------------\n");

        String user = "mmm";
        String password = "mmm";
        String url = "jdbc:derby://localhost:1527/SECONDDB;create=true";
        String driver = "org.apache.derby.jdbc.ClientDriver";
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            Class driverClass = Class.forName(driver);
            connection = DriverManager.getConnection(url, user, password);
            statement = connection.createStatement();

            resultSet = statement.executeQuery("SELECT EBOOK.ISBN, EBOOK.TITLE,EBOOK.PRICE, EBOOK.RATING,AUTHORS.NAME,AUTHORS.SURNAME FROM EBOOK, AUTHORS WHERE EBOOK.AUTHOR_ID=AUTHORS.AUTHOR_ID");
            String currentISBN = "";
            String currentTitle="";
            String currentPrice="";
            String currentRating = "", currentAName = "",currentASurname = "";
            System.out.println("Code\tName\tPrice\tRating\tAuthor\t");
            System.out.println("-----------------------------------------------");
           
          
            while (resultSet.next()) {
                currentISBN = resultSet.getString(1);
                currentTitle= resultSet.getString(2);
                currentPrice= resultSet.getString(3);
                currentRating = resultSet.getString(4);       
                currentAName = resultSet.getString(5);
                currentASurname = resultSet.getString(6);
                System.out.println(currentISBN + "\t" +currentTitle + "\t" +currentPrice + "\t"+currentRating + "\t" + currentAName + "\t" + currentASurname);
            
                } 
                      
             } catch (ClassNotFoundException  e) {
                  System.out.println(e.getMessage());
        } catch (SQLException e) {
            System.out.println(e.getMessage());

        } finally {
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException ex) {
                    System.out.println(ex);
                }
            }
            if (connection != null){
                try {
                    connection.close();
                }
                catch (SQLException ex) {
                    System.out.println(ex);
                }
            }
        }
        MenuEBook.zeroToExit();
        
    }
    
    

    public static void deleteEBook() {
        String codeDelete;
        
        System.out.print(
                "----------------------------------------\n"
                + "Code of the eBook to be deleted: ");
        codeDelete = userInput.next();
       String q1="DELETE FROM EBOOK WHERE EBOOK.ISBN='"+codeDelete+"'";
        
       String text1=codeDelete+" deleted";
        
       if (checkEbookCode(codeDelete)){
        SQLQuery.SimpleQuery(q1, text1);
       } else {
           System.out.println("Invalid code");
       }
      
        zeroToExit();
    }

    public static int checkAutor(String newName, String newSurname) {
        int checkAuthor = 0;
        String user = "mmm";
        String password = "mmm";
        String url = "jdbc:derby://localhost:1527/SECONDDB;create=true";
        String driver = "org.apache.derby.jdbc.ClientDriver";
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            Class driverClass = Class.forName(driver);
            connection = DriverManager.getConnection(url, user, password);
            statement = connection.createStatement();

            resultSet = statement.executeQuery("SELECT * FROM AUTHORS");
            String currentID = "";
            String currentName = "", currentSurname = "";
            while (resultSet.next()) {
                currentID = resultSet.getString(1);
                currentName = resultSet.getString(2);
                currentSurname = resultSet.getString(3);
                if (newName.equals(currentName) && newSurname.equals(currentSurname)) {
                    checkAuthor = Integer.parseInt(currentID);
                }

            }

        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (SQLException e) {
            System.out.println(e.getMessage());

        } finally {
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException ex) {
                    System.out.println(ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    System.out.println(ex);
                }
            }
        }
        return checkAuthor;
    }


    public static void printAutorEBook(List<Author> newEBookListAuthor) {
        System.out.print("   Authors: ");
        for (int j = 0; j < newEBookListAuthor.size(); j++) {
            System.out.print(newEBookListAuthor.get(j).getNameAuthor() + " "
                    + newEBookListAuthor.get(j).getSurnameAuthor() + " , ");
        }
    }

    public static void rateEBook() {
       String codeRated="";
       int newRating=0,newRatingBook=0; 
        System.out.print(
                "----------------------------------------\n"
                + "Code of the eBook to be rated: ");
        codeRated = userInput.next();
        
        EBook SEBook=null;
        SEBook=SQLQuery.EBookQuery(codeRated);
        
        if(SEBook==null){
            System.out.println("Code not found");
        } else{
            System.out.print("Insert new rating (1 to 5): ");

                newRating = userInput.nextInt();

                if ((newRating >= 1) && (newRating <= 5)) {
                    newRatingBook=Math.round((SEBook.getNoOfRatings()*SEBook.getRating()+newRating)/(SEBook.getNoOfRatings()+1));
                    int newNoOfRatings=SEBook.getNoOfRatings()+1;
                    String q1="UPDATE EBOOK SET RATING="+newRatingBook+", NOOFRATINGS="+newNoOfRatings+" WHERE ISBN='"+codeRated+"'";
                    System.out.println(q1);
                    String text1=SEBook.getTitle()+"Table EBOOK rated";
                     SQLQuery.SimpleQuery(q1,text1);
                            
                }
            }
        
        
        zeroToExit();
        
   
    }

    public static void zeroToExit() {
        System.out.print("----------------------------------------\n"
                + " Type 0 to get back to the menu: ");
        String exit = userInput.next();
    }

    public static void printInitMenu() {
        System.out.println(
                "----------------------------------------\n"
                + "Please follow three steps:\n"
                + "1. add author\n2. add eBook\nThen you can rate or delete a eBook\n"
                + "----------------------------------------\n");

    }
public static boolean checkEbookCode(String newCodeEBook) {
        boolean checkECode = false;
        String user = "mmm";
        String password = "mmm";
        String url = "jdbc:derby://localhost:1527/SECONDDB;create=true";
        String driver = "org.apache.derby.jdbc.ClientDriver";
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            Class driverClass = Class.forName(driver);
            connection = DriverManager.getConnection(url, user, password);
            statement = connection.createStatement();

            
            
            resultSet = statement.executeQuery("SELECT ISBN FROM EBOOK");
            String currentID = "";
            String currentName = "", currentSurname = "";
            while (resultSet.next()) {
                currentID = resultSet.getString(1);
                
                if (newCodeEBook.equals(currentID))  {
                    checkECode = true;
                }

            }

        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (SQLException e) {
            System.out.println(e.getMessage());

        } finally {
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException ex) {
                    System.out.println(ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    System.out.println(ex);
                }
            }
        }
        return checkECode;
    }

}
