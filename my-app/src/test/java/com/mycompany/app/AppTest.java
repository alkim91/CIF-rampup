package com.mycompany.app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.mycompany.app.App.Human;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
     public void greet() {
         Human Alex = new Human("Alex", 29);
        assertEquals("Hey there, Alex", Alex.greet("Hey there"));
     }
    
     @Test
     public void isAgeCorrect() {
         Human Alex = new Human("Alex", 29);
         assertNotNull(Alex.isAgeCorrect(28));
        assertEquals(true, Alex.isAgeCorrect(29));
     }
}
