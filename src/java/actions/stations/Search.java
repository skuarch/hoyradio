package actions.stations;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;
import java.util.Map;
import model.beans.Station;
import model.common.FoundStations;
import model.common.ModelSearch;
import model.common.ModelStations;
import model.common.Searcher;
import model.util.StringUtilities;
import org.apache.log4j.Logger;

/**
 *
 * @author skuarch
 */
public class Search extends ActionSupport {

    private static final Logger logger = Logger.getLogger(Search.class);
    private ArrayList<Station> stations = null;
    private ArrayList<Station> fs = new ArrayList<>();
    private String stringToSearch = null;

    //==========================================================================
    @Override
    public String execute() throws Exception {

        Map chm = FoundStations.getFoundStations();
        Station s = null;

        try {

            stringToSearch = StringUtilities.escapeString(stringToSearch);
            
            //save search
            model.beans.Search search = new model.beans.Search();
            search.setText(stringToSearch);
            ModelSearch.saveSearch(search);
            
            stringToSearch = stringToSearch.toLowerCase();
            stations = ModelStations.getActiveStations();

            stations.stream().forEach((station) -> {
                new Thread(new Searcher(station, stringToSearch)).start();
            });

            Thread.sleep(25);
            //System.out.println("found stations " + FoundStations.getFoundStations().size());
            chm.keySet().stream().forEach((key) -> {
                fs.add((Station) chm.get(key));
            });

        } catch (Exception e) {
            logger.error("execute", e);
        } finally {
            FoundStations.getFoundStations().clear();
        }

        return Action.SUCCESS;
    }

    public String getStringToSearch() {
        return stringToSearch;
    }

    public void setStringToSearch(String stringToSearch) {
        this.stringToSearch = stringToSearch;
    }

    public ArrayList<Station> getFs() {
        return fs;
    }

    public void setFs(ArrayList<Station> fs) {
        this.fs = fs;
    }

} // end class
