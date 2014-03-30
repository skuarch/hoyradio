package actions.stations;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import model.beans.Station;
import model.common.ModelStations;
import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;
import org.json.JSONObject;

/**
 *
 * @author skuarch
 */
public final class GetStation extends ActionSupport {

    private static final Logger logger = Logger.getLogger(GetStation.class);
    private long id = 0;
    private String json = null;

    //==========================================================================
    @Override
    public String execute() throws Exception {

        if (id < 0) {
            return Action.SUCCESS;
        }

        try {

            ServletActionContext.getResponse().setContentType("text/json");
            JSONObject jsono = new JSONObject();

            Station s = ModelStations.getStation(id);
            
            if(s == null){
                json = "";
            }
            
            jsono.accumulate("name", s.getName());
            jsono.accumulate("url", s.getUrlStreaming());
            jsono.accumulate("type", s.getType().getId());

            json = jsono.toString();

        } catch (Exception e) {
            logger.error("execute", e);
            return Action.SUCCESS;
        }

        return Action.SUCCESS;
    }

    //==========================================================================
    public String getJson() {
        return json;
    }

    public void setJson(String json) {
        this.json = json;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

} // end class
