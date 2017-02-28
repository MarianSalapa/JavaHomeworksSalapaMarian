/*
 * Class VacuumCleaner
 */
package familyscene;

/**
 *
 * @author MMM
 */
import java.util.concurrent.TimeUnit;

public class VacuumCleaner extends Thread {

    @Override
    public void run() {
        while (true) {
            try {
                System.out.println("Vacuum cleaner on");
                TimeUnit.MILLISECONDS.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("Vacuum cleaner turned off!");
                break;
            }
        }
    }
}
