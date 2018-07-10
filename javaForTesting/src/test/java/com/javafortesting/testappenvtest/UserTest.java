package com.javafortesting.testappenvtest;

import javafortesting.testappenv.User;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {

    @Test
    public void canConstructNewUser() {

        User user = new User();

        assertEquals("username", user.getUsername()); //username is private, so it can't be accessed from outside of the class, so a getter method is used | class.getAbc

        assertEquals("password", user.getPassword());
    }

    @Test
    public void canConstructNewUserWithCredentials(){

        User user = new User("admin", "adminpassword");

        assertEquals("admin", user.getUsername());

        assertEquals("adminpassword", user.getPassword());
    }

    @Test
    public void canSetUserPassword(){

        User user = new User();

        user.setPassword("pazzword12");

        assertEquals("pazzword12", user.getPassword());
    }
}
