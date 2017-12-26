package pl.tomasztopolewski;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import pl.tomasztopolewski.preparation.Installation;

import java.io.IOException;
import java.util.Date;

public class Main extends Application {
    public static String name = "Lists";
    public static String version = "0.00.450";
    public static String typeVersion = "pre-DEV";
    public static String author = "Tomasz Topolewski";
    public static String yearStart = "2017";


    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root;

        new Logs().appendStart("starting " + name + " v" + version + typeVersion);
        new Logs().appendReason();

        if (new Installation().isOkay()) {
            root = FXMLLoader.load(getClass().getResource("main.fxml"));
            primaryStage.setTitle(name + " v" + version + typeVersion);

            Scene primaryScene = new Scene(root, ControllerMain.widthMain, ControllerMain.heightMain);
            primaryStage.setScene(primaryScene);

            primaryScene.getStylesheets().add(getClass().getResource("main.css").toExternalForm());
            primaryStage.setResizable(false);
            primaryStage.sizeToScene();
            primaryStage.show();

            ControllerMain.createGrindPaneLists();
            primaryStage.setResizable(false);
            primaryStage.sizeToScene();
            primaryStage.show();
        } else {
            //kod dla niewłaściwej instalacji aplikacji
        }
    }


    public static void main(String[] args) throws IOException {
        launch(args);
        new Logs().appendEnd("end of testing.");
    }
}
