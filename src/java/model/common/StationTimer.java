package model.common;

import java.util.TimerTask;
import model.beans.Station;
import model.dao.DAO;
import org.apache.log4j.Logger;

/**
 *
 * @author skuarch
 */
public class StationTimer extends TimerTask {

    private static final Logger logger = Logger.getLogger(StationTimer.class);
    
    //==========================================================================
    public StationTimer() {
    }

    //==========================================================================
    @Override
    public void run() {
        
        try {
            
            logger.info("updating stations");
            StationContainer.setStations(new DAO().getArrayList(new Station()));
            
        } catch (Exception ex) {
            logger.error(" error ", ex);
        }
        
    }

} // end class
