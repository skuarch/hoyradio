package actions.stations;

import antlr.StringUtils;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import model.beans.Station;
import model.database.ModelStations;
import org.apache.commons.lang.StringEscapeUtils;
import org.apache.log4j.Logger;

/**
 *
 * @author skuarch
 */
public class AddClick extends ActionSupport {

    private static final Logger logger = Logger.getLogger(AddClick.class);      
    private String g = null;
    
    //==========================================================================
    public AddClick() {
    } // end AddCLick

    //==========================================================================
    @Override
    public String execute() throws Exception {
        
        Station station = null;
        
        try {
     
            g = StringEscapeUtils.escapeJava(g);        
            station = ModelStations.getStationByName(g);
            station.setClicks(station.getClicks() + 1);        
            ModelStations.updateStation(station);            
            
        } catch (Exception e) {
            logger.error("execute", e);
        }        
        
        return Action.NONE;
    } //end execute

    public String getG() {
        return g;
    }

    public void setG(String g) {
        this.g = g;
    }
    
} // end class