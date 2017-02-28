/*
 * 
 */
package familyscene;

/**
 *
 * @author MMM
 */
import java.util.concurrent.TimeUnit;

public class Cigarette extends Thread {

    @Override
    public void run() {
        while (true) {
            try {
                System.out.println("Cigarette burns");
                TimeUnit.MILLISECONDS.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("Cigarette putted out!");
                break;
            }
        }
    }
}
