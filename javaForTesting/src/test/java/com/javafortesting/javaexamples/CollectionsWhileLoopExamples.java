package com.javafortesting.javaexamples;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CollectionsWhileLoopExamples {

    @Test
    public void simpleCollection(){

        String number0123Array[]= {"zero", "one", "two", "three"};

        List<String> number0123 = Arrays.asList(number0123Array);               //converting array to a list of strings

        for(String numbers : number0123){
            System.out.println(numbers);
        }

        assertEquals("one", number0123.get(1));                        //accessing from a list using get method
        assertEquals("one", number0123Array[1]);

    }

    @Test
    public void simpleDynamicCollection(){                                      // collections are dynamic - no need to declare size

        List<String> number0123 = new ArrayList<String>();                      // ArrayList - array as interface -> List will behave as an array
        number0123.add("zero");
        number0123.add("one");
        number0123.add("two");
        number0123.add("three");

        assertEquals("one", number0123.get(1));
    }


    //while and do while loops

    public String someDays[] = {"Tuesday", "Friday", "Wednesday", "Monday", "Sunday"};

    public List<String> days = Arrays.asList(someDays);

    @Test
    public void findMondayLocation(){

        int forCount = 0;                                         //for each loop iterating over every element in the list until monday is found, break out of the loop
        for(String day : days){
            if(day.equals("Monday")){
                break;
            }
            forCount++;
        }
        assertEquals( 3, forCount, "Monday is at position 3");


        int loopCount;                                             // integer outside of the loop as it will be incremented in the body
        for(loopCount=0; loopCount <= days.size(); loopCount++){   // for loop iterating over size of the list, break when monday is found
            if(days.get(loopCount).equals("Monday")){
                break;
            }
        }
        assertEquals( 3, loopCount, "Monday is at position 3");
    }


    @Test
    public void whileLoopExamples() {

        int count = 0;
        while(!days.get(count).equals("Monday")) {                    //while loop, check for monday is a loop exit condition
            count++;                                                  //body is looped as long as while(condition) is true
        }                                                             // used when you want the loop to run 0 or more times
        assertEquals(3, count);


        int docount = -1;
        do{
            docount++;
        } while (!days.get(docount).equals("Monday"));                // evaluates if expression at the bottom of the loop is true instead of the top
        assertEquals(3, docount);                           // the statements within the do block are always executed at least once

    }

    @Test
    public void whileLoopExercise1(){

        String daysWeek[] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        List<String> daysList = Arrays.asList(daysWeek);

        int countdays = 0;
        while(!daysList.get(countdays).equals("Friday")){
            countdays++;
        }
        assertEquals(4, countdays);

        int fordays;
        for(fordays=0; !daysList.get(fordays).equals("Friday") ; fordays++){
        }
        assertEquals(4, fordays);
    }

}
