package com.javafortesting.testappenvtest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExceptionsExamples {


    @Test
    public void throwANullPointerException(){

        Integer age = null;
        String ageAsString;                                             //declared before try, otherwise it would only be accessible for code withing try{} block

        try {
            ageAsString = age.toString();

        }catch(NullPointerException e){                                 //declare what type of exceptions it will catch
            age = 18;
            ageAsString = age.toString();
        }catch(IllegalArgumentException e){                             //catch block can be repeated to catch multiple exceptions
            System.out.println("Illegal Argument: " + e.getMessage());
        }

        String yourAge = "Age equals " + age.toString() + " thanks to catch";

        assertEquals("Age equals 18 thanks to catch", yourAge);
    }

    @Test
    public void useExceptionAsAnObject(){
        Integer age = null;
        String ageAsString;

        try{
            ageAsString = age.toString();

        }catch(NullPointerException e){                     //in the catch block we have access to local variable e this allows to use a variety of methods on this exception

            System.out.println("getMessage - " +            //getMessage  shows the error message associated with the exception
                    e.getMessage());
            System.out.println("getStacktrace - " +         //getStackTrace  gets lines of code which ed up to the throwing of the exception
                    e.getStackTrace());
            System.out.println("printStackTrace");          //printStackTrace prints the stack trace to console or command line (when passed due to try catch)
            e.printStackTrace();
         }
    }
}
