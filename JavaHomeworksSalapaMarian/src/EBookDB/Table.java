/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EBookDB;


/**
 *
 * @author MMM
 */
public class Table {
    static void createTable(){
        String q1="CREATE TABLE AUTHORS (AUTHOR_ID INTEGER,NAME VARCHAR(24),SURNAME VARCHAR(24), PRIMARY KEY (AUTHOR_ID))";
        String text1="Table AUTHORS created";      
        String q2="CREATE TABLE EBOOK (ISBN VARCHAR(15),TITLE VARCHAR(15),PRICE INTEGER, RATING INTEGER, NOOFRATINGS INTEGER, AUTHOR_ID INTEGER, PRIMARY KEY (ISBN), FOREIGN KEY (AUTHOR_ID) REFERENCES AUTHORS(AUTHOR_ID))";
        String text2="Table EBOOK created";
        SQLQuery.SimpleQuery(q1, text1);
        SQLQuery.SimpleQuery(q2, text2);        
 
    }
    
    
}
