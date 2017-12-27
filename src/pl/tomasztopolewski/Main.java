package pl.tomasztopolewski;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import pl.tomasztopolewski.preparation.Installation;

import java.io.IOException;

public class Main extends Application {
    public final static String NAME = "Lists";
    public final static String VERSION = "0.00.600";
    public final static String TYPE_VERSION = "pre-DEV";
    public final static String AUTHOR = "Tomasz Topolewski";
    public final static String YEAR_START = "2017";


    Pane pane = new Pane();

    MenuBar menuBar = new MenuBar();

    Menu menuProgram = new Menu();
    MenuItem config = new MenuItem();
    CheckMenuItem syncing = new CheckMenuItem();
    MenuItem exit = new MenuItem();

    Menu menuLists = new Menu();
    MenuItem newListMenuBar = new MenuItem();;
    MenuItem editList = new MenuItem();
    MenuItem joinLists = new MenuItem();
    MenuItem deleteList = new MenuItem();

    Menu menuHelp = new Menu();
    MenuItem aboutProgram = new MenuItem();
    MenuItem help = new MenuItem();


    ToolBar toolBar = new ToolBar();
    Button newListToolBar = new Button();
    Button sync = new Button();


    Pane paneLists = new Pane();
    GridPane gridPaneLists = new GridPane();


    Label labelFooter;


    @Override
    public void start(Stage primaryStage) throws Exception{
        /////////////////////////////////////////////////////////////////////////////////////////
        ////      okno programu
        pane = new Pane();
        pane.setPrefSize(ControllerMain.HEIGHT_MAIN, ControllerMain.HEIGHT_MAIN);
        pane.getStylesheets().add(getClass().getResource("main.css").toExternalForm());

        /////////////////////////////////////////////////////////////////////////////////////////
        ////      pasek z menu (menu bar)
        menuBar.setPrefWidth(ControllerMain.WIDTH_MAIN);

        //      menu 'Program'
        menuProgram.setText("Program");
        config.setText("Konfiguracja");
        syncing.setText("Synchronizacja");
        syncing.setSelected(false); syncing.setDisable(true);
        exit.setText("Zamknij program");

        menuProgram.getItems().addAll(config, syncing, new SeparatorMenuItem(), exit);


        //      menu 'Notatki'
        menuLists.setText("Notatki");
        newListMenuBar.setText("Nowa notatka");
        editList.setText("Edytuj notatkę");
        joinLists.setText("Połącz notatki");
        joinLists.setDisable(true);
        deleteList.setText("Usuń notatkę");

        menuLists.getItems().addAll(newListMenuBar, editList, joinLists, deleteList);


        //      menu 'Pomoc'
        menuHelp.setText("Pomoc");
        aboutProgram.setText("O programie");
        help.setText("Pomoc");

        menuHelp.getItems().addAll(aboutProgram, new SeparatorMenuItem(), help);



        menuBar.getMenus().addAll(menuProgram, menuLists, menuHelp);


        /////////////////////////////////////////////////////////////////////////////////////////
        ////      pasek z szybki opcjami (tool bar)
        toolBar.setPrefSize(ControllerMain.WIDTH_MAIN, 40.0);
        toolBar.setLayoutX(0); toolBar.setLayoutY(27.0);
        toolBar.getStylesheets().add(getClass().getResource("toolBar.css").toExternalForm());

        //      opcja 'Nowa notatka'
        newListToolBar.setText("Nowa notatka");
        //      opcja 'Synchronizuj'
        sync.setText("Synchronizuj");

        toolBar.getItems().addAll(newListToolBar, sync);


        //// TWORZENIE LAYOUT'U
        pane.getChildren().add(menuBar);
        pane.getChildren().add(toolBar);

        //Parent root;

        new Logs().appendStart("starting " + NAME + " v" + VERSION + TYPE_VERSION + " from Main");
        new Logs().appendReason();

        if (new Installation().isOkay()) {
            //root = FXMLLoader.load(getClass().getResource("main.fxml"));
            primaryStage.setTitle(NAME + " v" + VERSION + TYPE_VERSION);

            Scene primaryScene = new Scene(pane, ControllerMain.WIDTH_MAIN, ControllerMain.HEIGHT_MAIN);
            //primaryScene.getStylesheets().add(getClass().getResource("main.css").toExternalForm());
            primaryStage.setScene(primaryScene);

            //primaryScene.getStylesheets().add(getClass().getResource("main.css").toExternalForm());
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
