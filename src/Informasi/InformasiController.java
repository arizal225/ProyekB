package Informasi;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class InformasiController implements Initializable{

    @FXML
    private Button winongo;

    private void handleButtonAction (ActionEvent event) throws Exception {
        Stage stage;
        Parent root;

        stage = (Stage) winongo.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("Winongo.fxml"));
    
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
        
    }

}