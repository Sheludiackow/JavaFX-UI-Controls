package BorderPane_HBox_VBox;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * JavaFX. Tutorial#2. BorderPane, HBox, VBox. (Урок 2)
 */
public class MainClass extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane root = new BorderPane();
        VBox vBox = new VBox(10);                // 001 Констркторы панелей с указанием отступа между элементами
        HBox hBox = new HBox(10);
        hBox.setAlignment(Pos.CENTER);           // 006 Выравнивание для кнопок по центру

        Button btn1 = addButton("1");            // 003 Так мы создаем кнопки
        Button btn2 = addButton("2");
        Button btn3 = addButton("3");
        Button btn4 = addButton("4");
        Button btn5 = addButton("5");
        Button btn6 = addButton("6");


        vBox.getChildren().addAll(btn1,btn2,btn3);  // 004 Добавляем кнопки на панели
        hBox.getChildren().addAll(btn4,btn5,btn6);

        root.setTop(vBox);                          // 005 Выставляем позиции для панелей
        root.setLeft(hBox);

        Scene scene = new Scene(root,300,250);      // 007 Создаем сцену, выравниваем и показываем ее
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private Button addButton(String name){       // 002 Метод добавляющий кнопки на панели
        Button btn = new Button();
        btn.setPrefSize(60,40);
        btn.setText(name);                       // Текст в кнопке это ее имя
        return btn;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
