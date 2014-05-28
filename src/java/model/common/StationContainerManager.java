package model.common;

import java.util.ArrayList;
import java.util.List;
import model.beans.Station;

/**
 *
 * @author skuarch
 */
public class StationContainerManager {

    private static ArrayList<Station> stations = null;

    //==========================================================================
    private StationContainerManager() {
    }

    //==========================================================================
    public static ArrayList<Station> getStationsLimit(int start, int end) {
        
        stations = StationContainer.getStations();
        List<Station> s = stations.subList(start, end);
        
        return new ArrayList<>(s);
    }

} // end class
