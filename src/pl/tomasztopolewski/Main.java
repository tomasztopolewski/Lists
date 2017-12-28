package pl.tomasztopolewski;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ToolBar;
import javafx.scene.control.Button;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import pl.tomasztopolewski.preparation.Installation;

import java.io.IOException;

public class Main extends Application {
    public final static String NAME = "Lists";
    public final static String VERSION = "0.00.620";
    public final static String TYPE_VERSION = "pre-DEV";
    public final static String AUTHOR = "Tomasz Topolewski";
    public final static String YEAR_START = "2017";
    public final static double HEIGHT_MAIN = 722.0, WIDTH_MAIN = 1000.0;


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

    Label labelFooter = new Label();


    @Override
    public void start(Stage primaryStage) throws Exception{

        createLayout();

        new Logs().appendStart("starting " + NAME + " v" + VERSION + TYPE_VERSION + " from Main");
        new Logs().appendReason();

        if (new Installation().isOkay()) {
            primaryStage.setTitle(NAME + " v" + VERSION + TYPE_VERSION);
            Scene primaryScene = new Scene(pane, WIDTH_MAIN, HEIGHT_MAIN);
            primaryStage.setScene(primaryScene);

            primaryStage.setResizable(false);
            primaryStage.sizeToScene();
            primaryStage.show();

        } else {
            ////////////////////////////////////////////////
            // kod dla niewłaściwej instalacji aplikacji //
            ////////////////////////////////////////////////
        }
    }


    public static void main(String[] args) throws IOException {
        launch(args);
        new Logs().appendEnd("end of testing.");
    }


    private void createLayout() {
        /////////////////////////////////////////////////////////////////////////////////////////
        ////      okno programu
        pane = new Pane();
        pane.setPrefSize(WIDTH_MAIN, HEIGHT_MAIN);
        pane.getStylesheets().add(getClass().getResource("css/main.css").toExternalForm());

        /////////////////////////////////////////////////////////////////////////////////////////
        ////      pasek z menu (menu bar)
        menuBar.setPrefWidth(WIDTH_MAIN);

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
        toolBar.setPrefSize(WIDTH_MAIN, 40.0);
        toolBar.setLayoutX(0); toolBar.setLayoutY(27.0);
        toolBar.getStylesheets().add(getClass().getResource("css/toolBar.css").toExternalForm());

        //      opcja 'Nowa notatka'
        newListToolBar.setText("Nowa notatka");
        //      opcja 'Synchronizuj'
        sync.setText("Synchronizuj");


        toolBar.getItems().addAll(newListToolBar, sync);


        /////////////////////////////////////////////////////////////////////////////////////////
        ////      obszar notatek
        paneLists.setPrefSize(970.0, 600.0);
        paneLists.setLayoutX(15.0); paneLists.setLayoutY(82.0);
        paneLists.setStyle("-fx-background-color:rgb(0, 0, 0)");


        /////////////////////////////////////////////////////////////////////////////////////////
        ////      label z autorem i wersją
        labelFooter.setText(NAME + " v" + VERSION + TYPE_VERSION + " by " + AUTHOR + " " + YEAR_START);
        labelFooter.setPrefSize(WIDTH_MAIN, 25.0);
        labelFooter.setLayoutX(0); labelFooter.setLayoutY(697.0);
        labelFooter.getStylesheets().add(getClass().getResource("css/labelFooter.css").toExternalForm());



        //// TWORZENIE LAYOUT'U
        pane.getChildren().add(menuBar);
        pane.getChildren().add(toolBar);
        pane.getChildren().add(paneLists);
        pane.getChildren().add(labelFooter);
    }
}
