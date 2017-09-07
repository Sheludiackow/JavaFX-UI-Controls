package Label;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.image.*;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


/**
 * JavaFX. Tutorial#3. Label. (Урок 3, Обучалка, Метка)
 */
public class MainClass extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane root = new Pane();                      // 001 Создаем панель (корневой узел)


        Label label = new Label();                   // 005 Создаем метку
        label.setText("This is a label");            // 006 Текст метки

        Image image = new Image(getClass().getResourceAsStream("001.jpeg"));
        ImageView img = new ImageView(image);        // 008 Загружаем изображение на экран
        img.setFitHeight(200);                       // 009 Устанавливаем его размеры
        img.setFitWidth(300);

        Label labelImg = new Label();                // 010 Ставим метку с изображением
        labelImg.setGraphic(img);
        labelImg.setTranslateX(150);                 // 011 Координаты метки в окне
        labelImg.setTranslateY(60);

        labelImg.setText("Miami");                   // 012 Надпись под картинкой
        labelImg.setGraphicTextGap(20);              // 013 Растояние надписи от картинки
        labelImg.setContentDisplay(ContentDisplay.TOP); // 014 Изображение над текстом


        Label magicLabel = new Label();              // 014 создаем метку реагирующую на наведение курсором
        magicLabel.setText("This is a Magic Label!!!");
        magicLabel.setTranslateX(220);
        magicLabel.setTranslateY(300);

        magicLabel.setOnMouseEntered(event -> {      // 015 Обработчик событий на наведение мышью
            magicLabel.setScaleX(1.5);
            magicLabel.setScaleY(1.5);
            magicLabel.setTextFill(Color.RED);
        });
        magicLabel.setOnMouseExited(event -> {       // 016 Обработчик событий на отведение курсора мыши
            magicLabel.setScaleX(1);
            magicLabel.setScaleY(1);
            magicLabel.setTextFill(Color.BLACK);
        });



        root.getChildren().addAll(label,labelImg,magicLabel);   // 007 Добавляем метку на панель
        Scene scene = new Scene(root,600,400);       // 002 Создаем сцену с параметром корневого узла
        primaryStage.setScene(scene);                // 003 Устанавливаем сцену на наше окно
        primaryStage.show();                         // 004 Отображаем окно

    }

    public static void main(String[] args) {
        launch(args);
    }
}
