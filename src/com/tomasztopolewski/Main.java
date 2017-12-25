package com.tomasztopolewski;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    public static String name = "Lists";
    public static String version = "0.0.010";
    public static String typeVersion = "pre-DEV";
    public static String author = "Tomasz Topolewski";
    

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("main.fxml"));
        primaryStage.setTitle(name + " v" + version + typeVersion + " by " + author);
        primaryStage.setScene(new Scene(root, ControllerMain.widthMain, ControllerMain.heightMain));
        primaryStage.setResizable(false);
        primaryStage.sizeToScene();
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
