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


public class PuzzleByyodlameTest {
    
    public PuzzleByyodlameTest() {
        
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

   
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        PuzzleByyodlame.main(args);
        PuzzleByyodlame frame =new PuzzleByyodlame("Puzzle Funny");
        ///assertEquals("", frame.getTitle());
        assertEquals("Puzzle Funny", frame.getTitle());
       
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
}
