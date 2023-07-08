package Informasi;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class WinongoController implements Initializable{

    @FXML
    private Button kembali;

    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private void switchToInformasi(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("../Informasi/Informasi.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setMaximized(true);
        stage.show();
    }
    

    
    

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
    }
}
