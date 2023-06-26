package Beranda;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import Utils.OpenScene;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class BerandaController implements Initializable {
    
    @FXML
    private Button informasi;
    
    @FXML
    private Button publikasi;

    @FXML
    private BorderPane mainPane;

    private Scene scene;

    private Stage stage;

    private Parent root;
    
    @FXML
    private void switchToPublikasi(ActionEvent event) throws IOException{
        mainPane.setCenter(OpenScene.getPane("../Publikasi/Publikasi"));
    }

    @FXML
    private void switchToInformasi(ActionEvent event) throws IOException{
        mainPane.setCenter(OpenScene.getPane("../Informasi/Informasi"));
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        if(mainPane.getCenter() == null){
            mainPane.setCenter(OpenScene.getPane("../Informasi/Informasi"));
        }
    }
}
    
    