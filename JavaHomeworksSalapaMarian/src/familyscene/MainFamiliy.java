/*
 * Class MainFamily
 */
package familyscene;

/**
 *
 * @author MMM
 */
public class MainFamiliy {

    public static void main(String[] args) {
      
        VacuumCleaner vacuumCleanerT= new VacuumCleaner();
        Cigarette cigaretteT=new Cigarette();
        Wife wifeT=new Wife(cigaretteT);
        Husband husbandT=new Husband(wifeT,vacuumCleanerT);
        Thread televisionT = new Television(husbandT);

        televisionT.start();
    }

}
