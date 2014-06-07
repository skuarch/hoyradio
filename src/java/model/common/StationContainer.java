package model.common;

import java.util.ArrayList;
import java.util.List;
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
    public static void addStation(Station station) {

        if (station == null) {

            throw new IllegalArgumentException("station is null");

        } else {

            stations.add(station);

        }

    }

    //==========================================================================
    public static void removeStation(Station station) {

        if (station == null) {

            throw new IllegalArgumentException("station is null");

        } else {

            stations.remove(station);

        }

    }

    //==========================================================================
    public static ArrayList<Station> getStations() {
        return stations;
    }

    //==========================================================================
    public static void setStations(ArrayList<Station> s) {

        if (stations == null) {

            throw new IllegalArgumentException("stations is null");

        } else {

            stations = s;

        }

    }
    
    //==========================================================================
    public static ArrayList<Station> getStationsLimit(int start, int end) {        
        
        List<Station> s = stations.subList(start, end);
        
        return new ArrayList<>(s);
        
    }

} // end class
