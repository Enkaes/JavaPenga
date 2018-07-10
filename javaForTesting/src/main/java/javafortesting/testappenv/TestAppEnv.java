package javafortesting.testappenv;

public class TestAppEnv {

    public static final String DOMAIN = "https://google"; // final values can't be changed  "Constants"
    public static final String PORT = ".com";

    public static String getUrl() {
        return(DOMAIN+PORT );
    }


}
