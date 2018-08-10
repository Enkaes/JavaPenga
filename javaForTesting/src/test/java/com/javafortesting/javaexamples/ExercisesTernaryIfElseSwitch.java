package com.javafortesting.javaexamples;

import javafortesting.testappenv.Cats;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class ExercisesTernaryIfElseSwitch {

    private String abcd;


    @Test
    public void numberOfCatsTernary() {                    //ternary operators


        Cats cats = new Cats(2);

        String x;

        x = (cats.getNumberOfCats() >= 2) ? "cats" : "cat";
        assertEquals("cats", x);

        Cats cats1 = new Cats(1);
        x = (cats1.getNumberOfCats() == 1) ? "cat" : "cats";
        assertEquals("cat", x);
    }


    @Test
    public void catOrCats(){

        int numberOfCats = 1;
        assertEquals(
                "cat",
                (numberOfCats == 1) ? "cat" : "cats");

        numberOfCats = 0;
        assertEquals(
                "cats",
                (numberOfCats == 1) ? "cat" : "cats");

        numberOfCats = 2;
        assertEquals(
                "cats",
                (numberOfCats == 1) ? "cat" : "cats");
    }




    private String catOrCats(int numberOfCats){
        return (numberOfCats == 1) ? "cat" : "cats";
    }

    @Test
    public void catOrCatsAsMethod(){

        assertEquals( "cat", catOrCats(1));

        assertEquals("cats", catOrCats(0));

        assertEquals( "cats", catOrCats(2));
    }




    public String catOrCarsIfElse(int numberOfCats) {

        if (numberOfCats == 1) {
            return "cat";
        } else {
            return "cats";

        }
    }
    @Test
    public void catOrCatsIfElse(){

        assertEquals("cats", catOrCarsIfElse(2));
    }


    @Test
    public void truthyIf(){

        boolean truthy = true;

        if(truthy)assertTrue(truthy);
    }

    @Test
    public void ifTruthyFalse(){

        boolean truthy = true;

        if(truthy){
            assertTrue(truthy);
            assertFalse(!truthy);
        }
    }
    @Test
    public void ifElseTruthy(){

        boolean truthy = true;

        if(truthy){
            assertTrue(truthy);
            assertFalse(!truthy);
        }
        else{
            assertFalse(truthy);
        }
    }




    @Test
    public void switchCountryCodes(){
        assertEquals("United Kingdom", likelyCountry("UK"));
        assertEquals("United States", likelyCountry("US"));
        assertEquals("United States", likelyCountry("USA"));
        assertEquals("France", likelyCountry("Fr"));
        assertEquals("Sweden", likelyCountry("Se"));
        assertEquals("Rest Of World", likelyCountry("abla"));

    }

    private String likelyCountry(String code) {
        String likelycountry="";

        switch(code.toUpperCase()) {
            case "UK":
                likelycountry = "United Kingdom";
                break;
            case "US":
                likelycountry = "United States";
                break;
            case "USA":
                likelycountry = "United States";
                break;
            case "FR":
                likelycountry = "France";
                break;
            case "SE":
                likelycountry = "Sweden";
                break;
            default:
                    likelycountry = "Rest Of World";
                break;
        }
        return likelycountry;
    }

    @Test
    public void switchIntegersToString(){
        assertEquals("One", integerNumber(1));
        assertEquals("Two", integerNumber(2));
        assertEquals("Three", integerNumber(3));
        assertEquals("Four", integerNumber(4));
        assertEquals("Too big", integerNumber(5));
        assertEquals("Too big", integerNumber(Integer.MAX_VALUE));
        assertEquals("Too small", integerNumber(0));
    }

    private String integerNumber(int integernumber){
        String number="";

        switch(integernumber){
            case 1:
                number = "One";
                break;
            case 2:
                number = "Two";
                break;
            case 3:
                number = "Three";
                break;
            case 4:
                number = "Four";
                break;
            default:
                if(integernumber > 4){
                number = "Too big";}
                if(integernumber < 1){
                    number = "Too small";}
                break;
                }
        return number;
    }

    @Test
    public void switchIntegersNoBreak(){
        assertEquals("One", integerBumber(1));
        assertEquals("Two", integerBumber(2));
        assertEquals("Three", integerBumber(3));
        assertEquals("Four", integerBumber(4));
        assertEquals("Too big", integerBumber(9));
        assertEquals("Too small", integerBumber(0));
    }

    private String integerBumber(int integerbumber){

        switch(integerbumber) {
            case 1:
                return "One";
            case 2:
                return "Two";
            case 3:
                return "Three";
            case 4:
                return "Four";
            default:
                if (integerbumber < 1) {
                    return "Too small";
                }
                if (integerbumber > 4) {
                    return "Too big";
                }
        }
        return "";
    }
}
