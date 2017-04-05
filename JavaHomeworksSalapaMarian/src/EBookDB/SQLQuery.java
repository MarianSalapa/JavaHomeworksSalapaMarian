/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EBookDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author MMM
 */
public class SQLQuery {
    static void SimpleQuery(String newQuery,String textOut){
        String user = "mmm";
        String password = "mmm";
        String url = "jdbc:derby://localhost:1527/SECONDDB;create=true";
        String driver = "org.apache.derby.jdbc.ClientDriver";
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        
        System.out.println("");
        try {
            Class driverClass = Class.forName(driver);
            connection = DriverManager.getConnection(url, user, password);
            statement = connection.createStatement();

            statement.execute(newQuery);
            System.out.println(textOut);

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
        
    }
    
static EBook EBookQuery(String codeSearched){
    EBook EBookSearch=null;
    String user = "mmm";
    String password = "mmm";
    String url = "jdbc:derby://localhost:1527/SECONDDB;create=true";
    String driver = "org.apache.derby.jdbc.ClientDriver";
    Connection connection = null;
    Statement statement = null;
    ResultSet resultSet = null;
        
    System.out.println("");
    try {
        Class driverClass = Class.forName(driver);
        connection = DriverManager.getConnection(url, user, password);
        statement = connection.createStatement();

        resultSet = statement.executeQuery("SELECT ISBN,TITLE,PRICE,RATING,NOOFRATINGS,AUTHOR_ID FROM EBOOK WHERE EBOOK.ISBN='"+codeSearched+"'");
            String currentISBN = "";
            String currentTitle="";
            String currentPrice="";
            String currentRating = "", currentNoOfRatings = "",currentAuthor_ID = "";
            
           
          
            while (resultSet.next()) {
                currentISBN = resultSet.getString(1);
                currentTitle= resultSet.getString(2);
                currentPrice= resultSet.getString(3);int price=Integer.parseInt(currentPrice);
                currentRating = resultSet.getString(4); int rating=Integer.parseInt(currentRating);     
                currentNoOfRatings = resultSet.getString(5);int noOfRatings=Integer.parseInt(currentNoOfRatings);
                currentAuthor_ID = resultSet.getString(6);
                
               EBookSearch=new EBook(currentTitle,price,rating,currentISBN);
               EBookSearch.setNoOfRatings(noOfRatings);
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
    
    
    return EBookSearch;
    
    }
    
    
    
}
