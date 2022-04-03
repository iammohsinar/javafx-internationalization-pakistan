package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Locale;
import java.util.ResourceBundle;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader loader = new FXMLLoader();
        ResourceBundle sb = ResourceBundle.getBundle("lang",new Locale("en","PK"));
        loader.setResources(sb);
        loader.setLocation(getClass().getResource("sample.fxml"));
        Parent root = loader.load();
        Scene s = new Scene(root, 300, 275);
        s.getStylesheets().add(getClass().getResource("main.css").toURI().toString());
        primaryStage.setTitle(sb.getString("heading.label"));
        primaryStage.setScene(s);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
