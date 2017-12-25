package pl.tomasztopolewski;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuBar;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.Pane;

import java.net.URL;
import java.util.ResourceBundle;

public class ControllerMain implements Initializable {
    public static double heightMain = 600.0, widthMain = 1000.0;

    @FXML
    MenuBar menuBar;
    @FXML
    Label labelFooter;
    @FXML
    ToolBar toolBar;

    @FXML
    Button newList;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        labelFooter.setText(Main.name + " v" + Main.version + Main.typeVersion + " by " + Main.author + " " + Main.yearStart);

    }

}
