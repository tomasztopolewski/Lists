package pl.tomasztopolewski;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

import java.net.URL;
import java.util.ResourceBundle;

public class ControllerMain implements Initializable {
    public static double heightMain = 722.0, widthMain = 1000.0;


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
    @FXML
    public GridPane gridPaneLists;


    @FXML
    Label labelFooter;



    @Override
    public void initialize(URL location, ResourceBundle resources) {
        labelFooter.setText(Main.name + " v" + Main.version + Main.typeVersion + " by " + Main.author + " " + Main.yearStart);

    }

    public void createGrindPaneLists() {
        gridPaneLists = new GridPane();
    }

}
