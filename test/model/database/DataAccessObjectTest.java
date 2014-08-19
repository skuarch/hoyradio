package model.database;

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
public class DataAccessObjectTest {
    
    public DataAccessObjectTest() {
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
     * Test of create method, of class DataAccessObject.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        Object object = new model.beans.Contry();
        long expResult = 0L;
        long result = DataAccessObject.create(object);
        assertEquals(expResult, result);
        
    }
}
