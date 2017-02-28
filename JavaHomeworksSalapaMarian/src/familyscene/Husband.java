/*
 * Class Husband
 */
package familyscene;

/**
 *
 * @author MMM
 */
import java.util.concurrent.TimeUnit;

public class Husband extends Thread {

    private final Thread wifeThread, vacuumThread;

    public Husband(Thread newWifeThread, Thread newVacuumThread) {
        super();
        wifeThread = newWifeThread;
        vacuumThread = newVacuumThread;
        System.out.println("Husband started vacuuming");
    }

   
    @Override
    public void run() {
        wifeThread.start();
        vacuumThread.start();
        while (true) {
            try {
                System.out.println("Husband is vacuuming");
                TimeUnit.MILLISECONDS.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("Husband turns off the vacuum cleaner!");
                vacuumThread.interrupt();
                System.out.println("Husband has to wake wife!");
                wifeThread.interrupt();
                break;
            }
        }
    }
}
