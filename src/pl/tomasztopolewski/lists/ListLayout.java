package pl.tomasztopolewski.lists;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.Pane;
import javafx.scene.text.TextAlignment;

import static javafx.scene.paint.Color.rgb;

public class ListLayout {

    public final static double HEIGHT_LIST = 200.0, WIDTH_LIST = 320.0;

    Pane list = new Pane();
    Label name = new Label(), date = new Label(), content = new Label();
    Button edit = new Button(), delete = new Button();

    public ListLayout(List list) {
        this.list.setPrefSize(WIDTH_LIST, HEIGHT_LIST);
        setStylePaneList();
        //this.list.setBackground(new Background());
        this.list.setStyle("-");
        this.list.getStylesheets().add(getClass().getResource("css/list.css").toExternalForm());

        this.name.setText(list.getName());
        this.name.setPrefSize(211.0, 17.0);
        this.name.setLayoutX(13.0); this.name.setLayoutY(13.0);
        this.name.setWrapText(false);
        this.name.setStyle("-fx-font-weight: bold;" +
                "-fx-font-size: 14px");

        this.date.setText(list.getDate());
        this.date.setPrefSize(211.0, 17.0);
        this.date.setLayoutX(13.0); this.date.setLayoutY(30.0);
        this.date.setWrapText(false);
        this.date.setStyle("-fx-font-style: Italic;" +
                "-fx-font-size: 11px");

        this.content.setText(list.getContent());
        this.content.setPrefSize(292.0, 143.0);
        this.content.setLayoutX(13.0); this.content.setLayoutY(57.0);
        this.content.setWrapText(true);
        this.content.setAlignment(Pos.TOP_LEFT);
        //this.content.setTextAlignment(TextAlignment.LEFT);
        this.content.setStyle("-fx-font-size: 12px;");

        this.edit.setText("E");
        this.edit.setPrefSize(27.0, 21.0);
        this.edit.setLayoutX(248.0); this.edit.setLayoutY(8.0);

        this.delete.setText("D");
        this.delete.setPrefSize(27.0, 21.0);
        this.delete.setLayoutX(282.0); this.delete.setLayoutY(8.0);

        this.list.getChildren().addAll(edit, delete,
                name, date, content);
    }


    public Pane getList() {
        return list;
    }

    public void setList(Pane list) {
        this.list = list;
    }

    private void setStylePaneList() {
        this.list.setStyle("-fx-background-color: rgb(249, 249, 249);"/* +
                "-fx-border-width: 1px; " +
                "-fx-border-style: solid;  " +
                "-fx-border-color: rgb(184, 184, 184); " +
                "-fx-border-radius: 5px;"*/);
    }
}
