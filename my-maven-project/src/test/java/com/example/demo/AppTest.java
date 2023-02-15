package com.example.demo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    //@Test
    //public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    @Test
    public void test(){System.out.println("This is the test number 1");}

    @Before
    public void bef(){System.out.println("This is before the test number 1");}

    @After
    public void aft(){System.out.println("This is afetr the test number 1");}

    @Test
    public void test2(){
        System.out.println("This is test 2 using assertions");
        assertEquals(8,8);
    }
}
