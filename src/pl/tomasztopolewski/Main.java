package pl.tomasztopolewski;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    public static String name = "Lists";
    public static String version = "0.0.310";
    public static String typeVersion = "pre-DEV";
    public static String author = "Tomasz Topolewski";
    public static String yearStart = "2017";


    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("main.fxml"));
        primaryStage.setTitle(name + " v" + version + typeVersion);

        Scene primaryScene = new Scene(root, ControllerMain.widthMain, ControllerMain.heightMain);
        primaryStage.setScene(primaryScene);

        primaryScene.getStylesheets().add(getClass().getResource("main.css").toExternalForm());
        primaryStage.setResizable(false);
        primaryStage.sizeToScene();
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
