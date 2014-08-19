package actions.stations;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;
import model.beans.Station;
import model.database.ModelStations;
import org.apache.log4j.Logger;

/**
 *
 * @author skuarch
 */
public class StationsByOrder extends ActionSupport {

    private static final Logger logger = Logger.getLogger(StationsByOrder.class);
    private String order = null;
    private ArrayList<Station> stations = null;

    //==========================================================================
    public StationsByOrder() {
    }

    //==========================================================================
    @Override
    public String execute() throws Exception {        
        
        try {
            
            //order = StringEscapeUtils.escapeHtml(order);
            //order = StringEscapeUtils.escapeJavaScript(order);
            stations = ModelStations.getStationsByOrder(order,20);
            
        } catch (Exception e) {            
            logger.error("error", e);
        }

        return Action.SUCCESS;

    } // end execute    

    //==========================================================================
    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public ArrayList<Station> getStations() {
        return stations;
    }

    public void setStations(ArrayList<Station> stations) {
        this.stations = stations;
    }
    
}// end class