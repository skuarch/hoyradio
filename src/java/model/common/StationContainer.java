package model.common;

import java.util.ArrayList;
import model.beans.Station;

/**
 *
 * @author skuarch
 */
public class StationContainer {

    private static ArrayList<Station> stations = new ArrayList<>();

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
    public static void setStations(ArrayList<Station> stations) {
        StationContainer.stations = stations;
    }

} // end class
