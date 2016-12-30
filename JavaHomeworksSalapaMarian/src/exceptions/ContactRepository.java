/*
 * Class ContactRepository
 */
package exceptions;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author MMM
 */
class ContactRepository {

    String file;

    ContactRepository(String file) {
        this.file = file;
    }

    void saveContact(String name, String email) {
        String row = name + "," + email + "\n";
        writeRow(row);
    }

    void writeRow(String row) {
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter(file, true));
            out.write(row);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
