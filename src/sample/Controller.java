package sample;


import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import java.util.Locale;
import java.util.ResourceBundle;

public class Controller {



    public Button enBtn;
    public Button urBtn;
    public Button sndBtn;
    public Label mainHeading;


    public void setUrdu() {
        changeLanguage(new Locale("ur","PK"),(Stage) urBtn.getScene().getWindow());
    }

    public void setEnglish() {
        changeLanguage(new Locale("en","PK"),(Stage) enBtn.getScene().getWindow());
    }

    public void setSindhi() {
        changeLanguage(new Locale("snd","PK"),(Stage) sndBtn.getScene().getWindow());
    }

    private void changeLanguage(Locale locale, Stage s) {
        try {
            FXMLLoader loader = new FXMLLoader();
            ResourceBundle sb = ResourceBundle.getBundle("lang", locale);
            loader.setResources(sb);
            loader.setLocation(getClass().getResource("sample.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root,300, 275);
            scene.getStylesheets().add(getClass().getResource("main.css").toURI().toString());
            s.setScene(scene);

        }catch (Exception e) {
            e.printStackTrace();
        }

    }

}
