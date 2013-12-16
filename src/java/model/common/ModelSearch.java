package model.common;

import model.beans.Search;
import model.dao.DAO;

/**
 *
 * @author skuarch
 */
public class ModelSearch {

    //==========================================================================
    private ModelSearch() {
    }    
    
    //==========================================================================
    public static void saveSearch(Search search) throws Exception {

        if (search == null) {
            throw new IllegalArgumentException("search is null");
        }

        new DAO().create(search);

    }

}
