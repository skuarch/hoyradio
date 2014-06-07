package model.common;

import java.util.ArrayList;
import java.util.Timer;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import model.beans.Station;
import model.dao.DAO;
import org.apache.log4j.Logger;

/**
 *
 * @author skuarch
 */
@WebListener
public class ServletListener implements ServletContextListener {

    public static final Logger logger = Logger.getLogger(ServletListener.class);
    public static ArrayList<Station> stations = null;
    private Timer timer = null;

    //==========================================================================
    public ServletListener() {
    }

    //==========================================================================
    @Override
    public void contextInitialized(ServletContextEvent sce) {

        try {
            
            //start timer to renew stations arrayList
            timer = new Timer();
            timer.scheduleAtFixedRate(new StationTimer(), 0, 1000 * 60 * 60);
            
            //start the stations array
            stations = new DAO().getArrayList(new Station());
            StationContainer.setStations(stations);               

        } catch (Exception e) {
            logger.error("contextInitialized", e);
        }

    } // end contextInitialized

    //==========================================================================
    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        
        stations = null;        
        timer.cancel();
        timer = null;
        
    } // end contextDestroyed

} // end class
