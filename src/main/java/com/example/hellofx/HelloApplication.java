package com.example.hellofx;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import java.time.LocalTime;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    private int scoreText = 0;
    private double opacity = 1;
    private Label lbl;
    private Label timelbl;
    private int totalMinute = 0;
    private int totalSecond = 5;
    private int currentMinute;
    private int currentSecond;
    final int width = 800;
    final int height = 600;

    @Override
    public void start(Stage stage) throws Exception {
        initUI(stage);
    }

    private void initUI(Stage stage) {

        var root = new StackPane();



        timelbl = new Label("Time: " + Integer.toString(currentMinute) + "." + Integer.toString(currentSecond));
        timelbl.setFont(Font.font(24));
        root.getChildren().add(timelbl);
        root.setAlignment(Pos.TOP_LEFT);

        lbl = new Label("Score: " + Integer.toString(scoreText));
        lbl.setFont(Font.font(24));
        //root.getChildren().add(lbl);
        //root.setAlignment(Pos.TOP_CENTER);

        AnimationTimer timer = new MyTimer();
        timer.start();

        var scene = new Scene(root, 300, 250);

        stage.setTitle("AnimationTimer");
        stage.setScene(scene);
        stage.show();
    }

    private class MyTimer extends AnimationTimer {
        int oldMinute = LocalTime.now().getMinute();
        int oldSecond = LocalTime.now().getSecond();
        @Override
        public void handle(long now) {
            doHandle();
        }

        private void doHandle() {
            currentMinute = LocalTime.now().getMinute();
            currentSecond = LocalTime.now().getSecond();

            if (currentSecond != oldSecond) {
                if(totalSecond == 0){
                    if(totalMinute == 0){
                        stop();
                    } else {
                        totalMinute -= 1;
                        totalSecond = 59;
                    }

                } else {
                    totalSecond -= 1;
                }
                timelbl.setText("Time: " + Integer.toString(totalMinute) + "." + Integer.toString(totalSecond));
            }

            scoreText++;
            lbl.setText("Score: " + Integer.toString(scoreText));
            lbl.opacityProperty().set(opacity);

            if (opacity <= 0) {

                stop();
                System.out.println("Animation stopped");
            }

            oldMinute = currentMinute;
            oldSecond = currentSecond;
        }
    }
}

