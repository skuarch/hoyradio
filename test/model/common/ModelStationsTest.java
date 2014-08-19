/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.common;

import model.database.ModelStations;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author skuarch
 */
public class ModelStationsTest {
    
    public ModelStationsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getStations method, of class ModelStations.
     */
    @Test
    public void testGetStations() throws Exception {
        ModelStations.getStations(10, 10);
    }
}