package actions.stations;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;
import model.beans.Station;
import model.logic.container.StationContainerManager;
import org.apache.log4j.Logger;

/**
 *
 * @author skuarch
 */
public class Stations extends ActionSupport{

    private static final Logger logger = Logger.getLogger(Stations.class);    
    private String js = null;
    private int start = 0;
    private int maxResults = 0;    
    private ArrayList<Station> stations = null;
    
    //==========================================================================
    @Override
    public String execute() throws Exception {
        
        try {
            
            stations = StationContainerManager.getStationsLimit(start, start + maxResults);
            
        } catch (Exception e) {
            logger.error("execute",e);
            js = "alertify.log('"+getText("text4")+"')";
            stations = new ArrayList<>();
        }
        
        return Action.SUCCESS;        
        
    } // end execute

    public String getJs() {
        return js;
    }

    public void setJs(String js) {
        this.js = js;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getMaxResults() {
        return maxResults;
    }

    public void setMaxResults(int maxResults) {
        this.maxResults = maxResults;
    }

    public ArrayList<Station> getStations() {
        return stations;
    }

    public void setStations(ArrayList<Station> stations) {
        this.stations = stations;
    }
    
} // end class