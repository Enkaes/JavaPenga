package javafortesting.testappenv;

public class User {
//    public String password = "Password";     here password would be a public static string, accessed by instatiating the User class user.password
    private String username;
    private String password;


    public User(){                                       // constructor -> has no return type in declaration (void, String etc.) and the name is the same as that of the class
        this("username", "password"); // constructor calling another constructor using "this" as the first statement    CONSTRUCTOR CHAINING
    }

    public User(String username, String password){          //assigns value to fields username and password
        this.username = username;                           // this creates a local variable
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword(){                           // getter and setter methods offered for a class with private class fieldsmnbvc
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }

}
