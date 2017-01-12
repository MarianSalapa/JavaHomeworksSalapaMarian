/*
 * class UsersMeth
 */
package containers;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author MMM
 */
public class UsersMeth {

    public static void addUser(List<User> newUserList) {
        String userName;
        Scanner userInput;
        MenuCont.printBorder();
        System.out.print("Insert user's name: ");

        userInput = new Scanner(System.in);
            userName = userInput.nextLine().trim(); 
 
        if (userName.length() > 0) {
            User newUser = new User(userName);
            newUserList.add(newUser);
            System.out.println("User added");
        } else {
            System.out.println("Name inserted is not valid");
        }
        MenuCont.zeroToExit();
        MenuCont.printBorder();
    }

    public static void printUserList(List<User> newUserList) {
        MenuCont.printBorder();
        if (newUserList.size() > 0) {
            System.out.println("User_Id\tName");
            for (int i = 0; i < newUserList.size(); i++) {

                System.out.println(newUserList.get(i).getUser_id()
                        + "\t" + newUserList.get(i).getUser_name()
                );

            }

        } else {
            System.out.println("Nothing to display");
        }
        MenuCont.zeroToExit();
        MenuCont.printBorder();
    }

    public static boolean checkUserId(List<User> newUserList, int idSearched) {
        boolean check=false;
        for (int i = 0; i < newUserList.size(); i++) {
            if (idSearched==newUserList.get(i).getUser_id()) {
                check = true;
            }
        }
    return check;
    }

    
}
