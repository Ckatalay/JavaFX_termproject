package com.example.hellofx;

import javafx.application.Application;

public class Launcher {
    public static void main(String[] args) {
        HelloApplication app = new HelloApplication();
        Application.launch(app.getClass(), args);

        Character player = new Character(app.width>>1, app.height>>1);

    }
}
