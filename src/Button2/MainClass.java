package Button2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * JavaFX. Tutorial#4. Button. (Урок 4, Обучалка, Кнопка)
 */
public class MainClass extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane root = new Pane();                      // 001 Создаем панель (корневой узел)

        Button button = new Button();                // 005 Создаем кнопку
        // button.setText("Click me!");


        Image image = new Image(getClass().getResourceAsStream("001.jpg")); // 007 Класс Image позволяющий загрузить изображение
        ImageView img = new ImageView(image);        // 008 Создаем обьект img позволяющий отобразить картинку
        img.setFitHeight(40);
        img.setFitWidth(40);

        button.setGraphic(img);                      // 009 Картинку в кнопку

        DropShadow shadow = new DropShadow();        // 010 Добавляем обработчик событий для установки тени на кнопку
        shadow.setColor(Color.DARKGREEN);
        shadow.setRadius(40);


        button.setStyle("-fx-base: #b6e7c9;");       // 012 Добавляем цвет кнопке (CSS для JavaFX)


        button.setOnAction(event -> button.setEffect(shadow) // 011 Обработчик событий кнопки
        );

        root.getChildren().addAll(button);           // 006 Добавляем нашу кнопку на панель
        Scene scene = new Scene(root,600,400);       // 002 Создаем сцену с параметром корневого узла
        primaryStage.setScene(scene);                // 003 Устанавливаем сцену на наше окно
        primaryStage.show();                         // 004 Отображаем окно

    }

    public static void main(String[] args) {
        launch(args);
    }
}
