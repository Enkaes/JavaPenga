package com.javafortesting.firsttests;


import javafortesting.testappenv.Cats;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class ControlFirstTest {

    @Test
    public void canImportStaticMethods() {
        Integer five = 5;
        assertEquals(5, five.intValue());
    }

    @Test
    public void booleanOperatorsListed() {

        assertTrue(4 != 5);  //test for inequality
        assertTrue(6 >= 6); //greater equal
    }

    @Test
    public void conditionalOperatorsListed() {     // && logical 'and'  || logical 'or'

        assertTrue(true && true);
        assertTrue(true || false);  // this would check the first operand only
        assertTrue(false || true);  // this would check both
        assertFalse(false || true);
    }

    @Test
    public void ternaryOperatorsListed() {           // condition ? operand1 : operand 2;   performs a check on condition and if true returns first operand, if false the second one

        int x;
        x = 4 > 3 ? 2 : 1;                            // x is set to value of first operand if the statement is true
        assertEquals(2, x);
        assertTrue(5 >= 4 ? true : false);
    }

    @Test
    public void stringsMethodsListed() {

        String aString = "abcdef";
        assertEquals(6, aString.length());     // static method returns number of characters in a string
        assertTrue(aString.contains("bcde"));            // static method returns true if substring is contained
        assertTrue(aString.startsWith("abc"));
        assertEquals("c", aString.charAt(2));   // static method returns the character at specified index (third one here)
        assertTrue(aString.compareToIgnoreCase("ABCDEF") == 0);
    }
}
