/*
 * class Author
 */
package EBookDB;

import eBookStore.*;

/**
 * implements attributes and behavior of an author
 * @author MMM
 */
public class Author {
    private String codeAuthor;
    private String nameAuthor;
    private String surnameAuthor;
    private static int noOfAuthors=0;
    

    public Author(String nameAuthor, String surnameAuthor) {
        noOfAuthors++;
        this.codeAuthor ="A"+Integer.toString(noOfAuthors);
        this.nameAuthor = nameAuthor;
        this.surnameAuthor = surnameAuthor;





    }

    public void setNameAuthor(String nameAuthor) {
        this.nameAuthor = nameAuthor;
    }

    public void setSurnameAuthor(String surnameAuthor) {
        this.surnameAuthor = surnameAuthor;
    }

    public String getCodeAuthor() {
        return codeAuthor;
    }

    public String getNameAuthor() {
        return nameAuthor;
    }

    public String getSurnameAuthor() {
        return surnameAuthor;
    }
    
    
}
