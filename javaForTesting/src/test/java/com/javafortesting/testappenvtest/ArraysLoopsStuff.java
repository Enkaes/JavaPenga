package com.javafortesting.testappenvtest;

import javafortesting.testappenv.User;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArraysLoopsStuff {

    //creating arrays

    int integersArray[] = new int[10];       //arrays of fixed size -> 10 values
    String[] stringsArray = new String[10];

    int integersTo6[] = {1,2,3,4,5,6};      //array with actual values

    int zeroLengthArray[] = {};                       //empty arrays
    int differentZeroLenthArray[] = new int[0];

    int multii[][] = new int[4][4];     // creates multidimensional array containing 4 items (arrays) with length of 4
    int multi[][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};


    // Array methods

    @Test
    public void arrayMethodsExamples() {

        String weekDays[];
        weekDays = Arrays.copyOf(workdays, 7);    // copies and resizes the workdays array to 7, 2 additional indexes contain default values (0 or null)
        weekDays[5] = "Saturday";
        weekDays[6] = "Sunday";

        String coupleDays[];
        coupleDays = Arrays.copyOfRange(workdays, 2, 5);   //copies subset of an array to a new array of the size of copied subset |from a to b+1|
        assertEquals(3, coupleDays.length);                // can also increase the size of an array by using endItemCount greater than the array size np. 7
        assertEquals(weekDays[2], coupleDays[0]);

        int filledDays[] = new int[5];                             // fills every item in the array with the same value
        Arrays.fill(filledDays, 3);
        Arrays.fill(filledDays, 1, 4, 5);    // fills items indexed from 1 to 3 with value 5
        assertEquals(5, filledDays[3]);
        assertEquals(3, filledDays[4]);

        int outOfOrder[] = {3, 1, 6, 4, 5, 2};                     //strings can also be sorted A-z, but lowercase/uppercase matters
        Arrays.sort(outOfOrder);
        assertEquals(1, outOfOrder[0]);
        assertEquals(2, outOfOrder[1]);
        assertEquals(3, outOfOrder[2]);
    }



    @Test
    public void createArrayOfUsers() {

        User users[] = new User[3];

        users[0] = new User("Mike", "Litoris");
        users[1] = new User("Johnsons", "Baby");
        users[2] = new User("Chris P", "Chicken");

        assertEquals("Mike", users[0].getUsername());
        assertEquals("Johnsons", users[1].getUsername());
        assertEquals("Chicken", users[2].getPassword());

        for(User names : users){
            System.out.println(names.getUsername());
        }
    }


    private String workdays[] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};

    @Test
    public void forEachThroughWorkdays(){            //for each loop

        String days="";

        for( String workday : workdays){     // for( variable : collection) { do something }
            days = days + "|" + workday;     // creates variable and assignes items from collection, one after another
        }

        assertEquals("|Monday|Tuesday|Wednesday|Thursday|Friday", days);
    }

    @Test
    public void forLoopThroughWorkdays(){       //for loop

        String days="";

        for(int i=0; i<5; i++){                 //  for(statement with initial value; loop condition; executed after each loop){ do something }
            days = days + "|" + workdays[i];
        }

        assertEquals("|Monday|Tuesday|Wednesday|Thursday|Friday", days);
    }

    @Test
    public void forEachLoopWithIndex(){

        int dayindex = 0;

        for( String workday : workdays){
            System.out.println("found " + workday + " at position " + dayindex);
            dayindex++;
        }
    }

    @Test
    public void arrayOfHundredUsers(){

     User users[] = new User[100];

     for(int userIndex = 0; userIndex<users.length; userIndex++){
         int userId = userIndex+1;
         users[userIndex] = new User("user" + userId, "password" + userId);
     }

     for( User aUser : users){                                                                    // check if array got created properly
         System.out.println(aUser.getUsername()+ "," + aUser.getPassword() );
     }

     int userId = 1;
     for(User userX : users){
         assertEquals("user" + userId, userX.getUsername());
         assertEquals("password" + userId, userX.getPassword());
         userId++;
     }
    }

    @Test
    public void createTriangle2dArray(){

        int[][]triangle = new int [16][];

        for(int row=0; row<triangle.length; row++){
            triangle[row] = new int[row+1];
            for(int i=0; i< (row+1); i++){
                triangle[row][i] = i;
            }
        }
//        print2DIntArray(triangle);
    }

}
