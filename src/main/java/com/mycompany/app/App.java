package com.mycompany.app;

/**
 * welcome chez orange digital center
 */
public class App
{

    private final String message = "welcome chez orange digital center";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }

    private final String getMessage() {
        return message;
    }

}
