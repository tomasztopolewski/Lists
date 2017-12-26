package pl.tomasztopolewski.lists;

import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class VBoxList {
    public VBox getVBoxList(List list, double height, double width) {
        VBox vBoxList = new VBox();

        Label name = new Label(list.getName());
        name.setFont(Font.font(String.valueOf(Font.getDefault()), FontWeight.BOLD, 14));
        name.setWrapText(false);
        vBoxList.getChildren().add(name);

        Label date = new Label(list.getDate());
        date.setFont(Font.font(String.valueOf(Font.getDefault()), 12));
        date.setWrapText(false);
        vBoxList.getChildren().add(date);

        Label content = new Label(list.getContent());
        content.setFont(Font.font(String.valueOf(Font.getDefault()), 14));
        content.setWrapText(true);
        vBoxList.getChildren().add(content);

        return vBoxList;
    }
}
