package pl.tomasztopolewski.lists;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

public class ListLayout {

    public final static double HEIGHT_LIST = 200.0, WIDTH_LIST = 320.0;

    Pane list = new Pane();
    Label name = new Label(), date = new Label(), content = new Label();
    Button edit = new Button(), delete = new Button();

    public ListLayout(List list) {
        this.list.setPrefSize(WIDTH_LIST, HEIGHT_LIST);

        this.name.setText(list.getName());
        this.name.setPrefSize(211.0, 17.0);
        this.name.setLayoutX(13.0); this.name.setLayoutY(13.0);
        this.name.setWrapText(false);

        this.date.setText(list.getDate());
        this.date.setPrefSize(211.0, 17.0);
        this.date.setLayoutX(13.0); this.date.setLayoutY(30.0);
        this.name.setWrapText(false);

        this.content.setText(list.getContent());
        this.content.setPrefSize(292.0, 143.0);
        this.content.setLayoutX(13.0); this.content.setLayoutY(47.0);
        this.content.setWrapText(true);

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
}
