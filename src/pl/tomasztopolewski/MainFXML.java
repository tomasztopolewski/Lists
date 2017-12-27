package pl.tomasztopolewski;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import pl.tomasztopolewski.preparation.Installation;

import java.io.IOException;

import static pl.tomasztopolewski.Main.*;

public class MainFXML extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root;

        new Logs().appendStart("starting " + NAME + " v" + VERSION + TYPE_VERSION + " from MainFXML");
        new Logs().appendReason();

        if (new Installation().isOkay()) {
            root = FXMLLoader.load(getClass().getResource("main.fxml"));
            primaryStage.setTitle(NAME + " v" + VERSION + TYPE_VERSION);

            Scene primaryScene = new Scene(root, WIDTH_MAIN, HEIGHT_MAIN);
            primaryStage.setScene(primaryScene);

            primaryScene.getStylesheets().add(getClass().getResource("css/main.css").toExternalForm());
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
