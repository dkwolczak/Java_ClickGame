package com.company;

import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;


public class ClickCounter extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    Button btn;
    Label lbl;
    int iClickCount = 0;

    @Override public void start(Stage primaryStage) {
        btn = new Button();
        btn.setText("Click me as many times possible!");
        btn.setOnAction(e-> buttonClick());

        lbl = new Label();
        lbl.setText("Are you scared? Why haven't you clicked the button?");

        BorderPane pane = new BorderPane();
        pane.setTop(lbl);
        pane.setCenter(btn);

        Scene scene = new Scene(pane, 250, 150);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Click Counter");
        primaryStage.show();
    }

    public void buttonClick() {

        iClickCount++;
        if (iClickCount == 1) {
            lbl.setText("Seriously? You Only Clicked Once! Is that all you got?");
        }
        else {
            lbl.setText("You clicked "
                    + iClickCount + "times." );
        }
    }
}
