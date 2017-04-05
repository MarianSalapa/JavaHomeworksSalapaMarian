/*
 * class AuthorMethodsList
 */
package EBookDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Implements methods of author's list
 *
 * @author MMM
 */
public class AuthorsListM {

    public static void addAuthor() {
        String name, surname, code;
        System.out.print("----------------------------------------\n"
                + "________Add new author________"
                + "\nInsert author's name:");
        name = MenuEBook.userInput.next();
        System.out.print("Insert author's surname:");
        surname = MenuEBook.userInput.next();
        System.out.print("Insert code:");
        code = MenuEBook.userInput.next();
      
        String q1="INSERT INTO AUTHORS (AUTHOR_ID , NAME, SURNAME)VALUES ("+code+",'"+name+"','"+surname+"')";
        String text1="Author " + name + " " + surname + " added";
        SQLQuery.SimpleQuery(q1, text1);
        
         MenuEBook.zeroToExit();
        
    }

    public static void printAuthorsList()  {
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

            resultSet = statement.executeQuery("SELECT * FROM AUTHORS");
            String currentID = "";
            String currentName = "", currentSurname = "";
            System.out.println("Code\tName\tSurname");
            System.out.println("-------------------------");
            while (resultSet.next()) {
                currentID = resultSet.getString(1);
                currentName = resultSet.getString(2);
                currentSurname = resultSet.getString(3);
                System.out.println(currentID + "\t" + currentName + "\t" + currentSurname);
            
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
    
}