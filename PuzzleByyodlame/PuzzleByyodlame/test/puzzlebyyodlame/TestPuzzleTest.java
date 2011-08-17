/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package puzzlebyyodlame;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author AuMi@Com
 */
public class TestPuzzleTest {
    
    public TestPuzzleTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class TestPuzzle.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        TestPuzzle.main(args);
        PuzzleByyodlame frame =new PuzzleByyodlame("Puzzle Funny");
        assertEquals("Puzzle Funny", frame.getTitle());
        
        
        fail("The test case is a prototype.");
    }
}
