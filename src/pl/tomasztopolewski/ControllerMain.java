package pl.tomasztopolewski;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

import java.net.URL;
import java.util.ResourceBundle;

import static pl.tomasztopolewski.Main.NAME;
import static pl.tomasztopolewski.Main.TYPE_VERSION;
import static pl.tomasztopolewski.Main.VERSION;
import static pl.tomasztopolewski.Main.AUTHOR;
import static pl.tomasztopolewski.Main.YEAR_START;
import static pl.tomasztopolewski.Main.HEIGHT_MAIN;
import static pl.tomasztopolewski.Main.WIDTH_MAIN;

public class ControllerMain implements Initializable {
    @FXML
    MenuBar menuBar;

    @FXML
    Menu menuProgram;
    @FXML
    MenuItem config;
    @FXML
    MenuItem syncing;
    @FXML
    MenuItem exit;

    @FXML
    Menu menuLists;
    @FXML
    MenuItem newListMenuBar;
    @FXML
    MenuItem editList;
    @FXML
    MenuItem joinLists;
    @FXML
    MenuItem deleteList;

    @FXML
    Menu menuHelp;
    @FXML
    MenuItem aboutProgram;
    @FXML
    MenuItem help;


    @FXML
    ToolBar toolBar;
    @FXML
    Button newListToolBar;
    @FXML
    Button sync;


    @FXML
    public Pane paneLists;
    //@FXML
    public GridPane gridPaneLists = new GridPane();


    @FXML
    Label labelFooter;



    @Override
    public void initialize(URL location, ResourceBundle resources) {
        labelFooter.setText(NAME + " v" + VERSION + TYPE_VERSION + " by " + AUTHOR + " " + YEAR_START);
    }


    public GridPane getGridPaneLists() {
        return gridPaneLists;
    }

    public static void createGrindPaneLists() {
        //gridPaneLists = new GridPane();
        //gridPaneLists.add(new VBoxList().getVBoxList(new List("Tomasz Topolewski", "26/12/2017 22:23", "Super jestem i nikt nie zaprzeczy."), 200, 200), 0, 0);
    }

}
