/*
 * Television Class
 */
package familyscene;

/**
 * 
 * @author MMM
 */

import java.util.concurrent.TimeUnit;

public class Television extends Thread {
    public String[] tvShow= {"Other TV show","Other TV show","Wife's favourite TV show"}; 
    private final Thread husbandThread;

    
    public Television(Thread newHusbandThread) {
        super();
        husbandThread = newHusbandThread;
    }

    
    @Override
    public void run() {
        husbandThread.start();
        
        try {
            while (true) {
                
                int i=(int)(Math.random() * (tvShow.length));
             
                System.out.println("TV show: " + tvShow[i]);
                if (tvShow[i].equals("Wife's favourite TV show")) {
                    throw new InterruptedException();
                }
                TimeUnit.MILLISECONDS.sleep(2000);
            }
        } catch (InterruptedException e) {
            husbandThread.interrupt();
        }
    }
}
