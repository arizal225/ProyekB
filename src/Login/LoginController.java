package Login;

import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.ResourceBundle;

import javax.management.Notification;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class LoginController implements Initializable {

    @FXML
    private TextField username;

    @FXML
    private PasswordField password;

    @FXML
    private Button loginButton;

    @Override
    public void initialize(URL location, ResourceBundle resources) {}

    public void login (MouseEvent event) throws IOException{
        if(username.getText().equals("admin") && password.getText().equals("admin")){
            // 1. Baca file fxml
            Parent root = FXMLLoader.load(getClass().getResource("../Beranda/Beranda.fxml"));

            // 2. Buat scene baru dari file fxml
            Scene newScene = new Scene (root);
            
            // 3. Cari di node mana event terjadi
            Node node = (Node) event.getSource();
            
            // 4. Cari di stage mana node berada
            Stage stage = (Stage) node.getScene().getWindow();

            // 5. Setelah mendapatkan stage, ubah scene dari stage tersebut dengan scene baru
            stage.setScene(newScene);
            stage.setMaximized(true);
        }
    }
}