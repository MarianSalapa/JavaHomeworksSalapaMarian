/*
 * Class Wife
 */
package familyscene;

/**
 *
 * @author MMM
 */

import java.util.concurrent.TimeUnit;

public class Wife extends Thread {
    

    private final Thread cigarThread;
    
 
    public Wife(Thread newCigarThread) {
      
        cigarThread = newCigarThread;
    }

    @Override
    public void run() {
        cigarThread.start();
        while (true) {
            try {
                System.out.println("Wife is sleeping");
                TimeUnit.MILLISECONDS.sleep(2000);
            }
            catch (InterruptedException e) {
                System.out.println("Wife is waking up!");
                System.out.println("Wife needs to put out the cigar!");
                cigarThread.interrupt();
                break;
            }
        }
    }
    
}
