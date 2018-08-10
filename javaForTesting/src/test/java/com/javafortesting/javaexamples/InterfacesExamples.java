package com.javafortesting.javaexamples;

import javafortesting.testappenv.User;
import org.junit.jupiter.api.Test;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class InterfacesExamples {

    /* important interface examples

    Collection - generic collection you can add objects to, group of objects, where each object is referred to as an element
    Set - collection that does not allow duplicates
    List- collection you can access and add elements
    Map - "key,value" pair where you store an object in the collection, but can access it with a unique key - provides a wat to associate an object with a key for later retrival and accessing

     */

    @Test
    public void collectionExamplesAndMethods() {

        Collection wholeweek;                                   //cannot instantiate Collection as it is an interface, declare variable workdays as Collection
        wholeweek = new ArrayList();                            //and instantiate it with implementation: a class which implements that interface i.e. ArrayList.

        Collection<String> samplecollection;                    //collection contains objects by default, not string, int etc.
        Collection<String> weekdays = new ArrayList<>();        //try to declare collection as collection of type if all objects will be of same type

        weekdays.add("Monday");                                 //add elements to collection
        weekdays.add("Tuesdayy");
        weekdays.add("Wednesday");
        weekdays.add("Thursday");
        weekdays.add("Friday");

            assertEquals(5, weekdays.size());          //count number of elements in collection

        weekdays.remove("Tuesdayy");
            assertFalse(weekdays.contains("Tuesdayy"));

        wholeweek.addAll(weekdays);                             //add all elements from another collection
            assertEquals(weekdays.size(), wholeweek.size());
            assertTrue(weekdays.containsAll(wholeweek));        //check if collections contains all elements of another collection

        wholeweek.add("Saturday");
        wholeweek.add("Sunday");



        for(String day : weekdays){
            System.out.println(day);
        }

        for( Object day : wholeweek){                         //when iterating over collection without a predeclared type we need an object, not a string or int
        String outputToString = (String)day;                  //casting object to String type - can by avoided when specifying type when declaring
        System.out.println(outputToString);
        }

        String anotherArray[] = new String[wholeweek.size()];       //converting collection to an array with toArray(anArray) call
        wholeweek.toArray(anotherArray);
        assertEquals("Monday".length(), anotherArray[0].length());

    }

    @Test
    public void createAndManipulateCollectionOfUsers(){

        Collection <User> someusers = new ArrayList<User>();

        assertEquals(0, someusers.size());
        assertTrue(someusers.isEmpty());

        User Henryk = new User();
        User Francis = new User();

        ((ArrayList<User>) someusers).add(Henryk);
        ((ArrayList<User>) someusers).add(Francis);

        assertEquals(2, someusers.size());
        assertFalse(someusers.isEmpty());


        Collection <User> moreusers = new ArrayList<User>();

        User James = new User();
        User Dantes = new User();

        ((ArrayList<User>) moreusers).add(James);
        ((ArrayList<User>) moreusers).add(Dantes);

        ((ArrayList<User>) someusers).addAll(moreusers);

        assertTrue(someusers.containsAll(moreusers));

        moreusers.removeAll(someusers);
        someusers.clear();


    }

}
