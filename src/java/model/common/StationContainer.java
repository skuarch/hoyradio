package model.common;

import java.util.ArrayList;
import model.beans.Station;

/**
 *
 * @author skuarch
 */
public class StationContainer {

    private static ArrayList<Station> stations = new ArrayList<>(200);

    //==========================================================================
    private StationContainer() {
    } // end StationContainer

    //==========================================================================
    public static ArrayList<Station> getStations() {
        return stations;
    }

    //==========================================================================
    public static void setStations(ArrayList<Station> s) {
        stations = s;
    }

} // end class
