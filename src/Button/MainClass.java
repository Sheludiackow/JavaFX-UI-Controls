package Button;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 * JavaFX. Tutorial#1. Button. (Урок 1. Кнопка.)
 */
public class MainClass extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("MyWindow");  // 002 Название окна
        primaryStage.setWidth(300);         // 003 Задали разиеры окна
        primaryStage.setHeight(300);


        Pane root = new Pane();             // 005 Корень в котором будут располагаться все элементы
        Button btn = new Button();          // 007 Создаем кнопку
        btn.setText("Click me");            // 008 Текст в кнопке
        btn.setTranslateX(110);             // 010 Задали позицию кнопке
        btn.setTranslateY(110);
        btn.setPrefSize(90,20);             // 011 Задали размеры кнопке

        Rectangle rect = new Rectangle(50,50); // 013 Создали элемент прямоугольник

        btn.setOnAction(event -> {          // 012 Добавили кнопке обработчик событий
            rect.setFill(Color.RED);        // 014 Прямоугольник при нажатии кнопки Красный
            System.out.println("Hello");
        });


        Scene scene = new Scene(root);      // 004 Создаем сцену в параметрах которой указываем наш корневой узел


        root.getChildren().addAll(btn,rect);    // 009 Добавляем кнопку на нашу панель // Прямоугольник
        primaryStage.setScene(scene);      // 006 Задаем сцену для нашего окна
        primaryStage.show();               // 001 Функция show отображает наше окно на экране
    }

    public static void main(String[] args) {
        launch(args);
    }
}
