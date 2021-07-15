/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package count.words;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Nancy
 */
public class CountWordsTest {
    
    public CountWordsTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Tests of countM method, of class CountWords.
     */
    @Test
    public void CountMTest1() {
        System.out.println("countM Test 1");
        String str = "Many people want to master the art of Making good projects.";
        int expResult = 3;
        int result = CountWords.countM(str);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @Test
    public void CountMTest2() {
        System.out.println("countM Test 2");
        String str = "Mandy has many more Money";
        int expResult = 4;
        int result = CountWords.countM(str);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class CountWords.
     * @throws java.lang.Exception
     */
    @Test
    public void MainTest() throws Exception {
        System.out.println("main");
        String[] args = null;
        CountWords.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
