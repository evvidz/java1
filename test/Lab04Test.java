/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import lab04.Lab04;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 1710510
 */
public class Lab04Test {
    
    public Lab04Test() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void positiveTest() {
    int[] actual = { 5, 1, 6, 2, 3, 4 };
    int[] expected = { 1, 2, 3, 4, 5, 6 };
    Lab04.mergeSort(actual, actual.length);
    assertArrayEquals(expected, actual);
}
    @Test
    public void positiveTest2() {
    int[] actual = { 10, 5, 7, 22, 1, 8 };
    int[] expected = { 1, 5, 7, 8, 10, 22 };
    Lab04.mergeSort(actual, actual.length);
    assertArrayEquals(expected, actual);
}
    @Test
    public void positiveTest3() {
    int[] actual = { 99, 59, 66, 95, 102, 100 };
    int[] expected = { 59, 66, 95, 99, 100, 102 };
    Lab04.mergeSort(actual, actual.length);
    assertArrayEquals(expected, actual);
}
}
