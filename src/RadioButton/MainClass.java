package RadioButton;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 * JavaFX. Tutorial#5. RadioButton. (Урок 5, Обучалка, Кнопка)
 */
public class MainClass extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane root = new BorderPane();                      // 001 Создаем панель (корневой узел)
        HBox buttons = new HBox(10);                 // 006 создали панель в которой будут находится кнопки
        buttons.setAlignment(Pos.CENTER);            // 007 Выровняли кнопки по центру
        HBox picture = new HBox();                   // 013 Создали нанель для картинок
        picture.setAlignment(Pos.CENTER);

        ToggleGroup group = new ToggleGroup();           // 010 Создали группу для кнопок

        RadioButton rb1 = new RadioButton("Сalendar");   // 005 Создали три кнопки
        RadioButton rb2 = new RadioButton("Home");
        RadioButton rb3 = new RadioButton("Contacts");

        rb1.setToggleGroup(group);                       // 011 Каждую кнопку отправляем в группу
        rb2.setToggleGroup(group);
        rb3.setToggleGroup(group);

        rb1.setUserData("001");                          // 020 Записываем в каждую кнопку информацию о ней
        rb2.setUserData("002");
        rb3.setUserData("003");

        ImageView img = new ImageView();                 // 015 Создали обьект для отображения картинки

        group.selectedToggleProperty().addListener(event -> {  // 017 Обработчик событий для выбранной кнопки
            // 021 Получаем информацию о картинке и преобразуем ее в строку
            Image image = new Image(getClass().getResourceAsStream(group.getSelectedToggle().getUserData()+ ".png"));
            img.setImage(image);                         // 022 Получаем картинку
            img.setFitWidth(300);                        // 023 Задаем размеры картинке
            img.setFitHeight(300);

        });

        rb2.setSelected(true);                           // 012 По умолчанию выбрана кнопка rb2


        buttons.getChildren().addAll(rb1,rb2,rb3);   // 008 Добавили кнопки на панель
        picture.getChildren().add(img);              // 016 Добавили обьект картинки на панель для картинки
        root.setTop(buttons);                        // 009 Кнопки по центру вверху
        root.setCenter(picture);                     // 014 Картинки по центру окна
        Scene scene = new Scene(root,600,400);       // 002 Создаем сцену с параметром корневого узла
        primaryStage.setScene(scene);                // 003 Устанавливаем сцену на наше окно
        primaryStage.show();                         // 004 Отображаем окно
    }

    public static void main(String[] args) {
        launch(args);
    }
}
