package Beranda;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javax.swing.Action;

import Utils.OpenScene;
import javafx.animation.TranslateTransition;
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
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.Duration;

public class BerandaController implements Initializable {
    
    @FXML
    private Button informasi;

    @FXML
    private Button tentanggg;

    @FXML
    private Button publikasi;

    @FXML
    private Button tentang;

    @FXML
    private BorderPane mainPane;

    @FXML
    private Button logout;

    private Scene scene;

    private Stage stage;

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

    @FXML
    private void switchToDlh(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("../TentangDlh/tentangDlh.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setMaximized(true);
        stage.show();
    }

    @FXML
    private void switchToTentang(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("../TentangAplikasi/Tentang.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setMaximized(true);
        stage.show();
    }

    

    @FXML
    private void switchToLogin(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("../Login/Login.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    
    
    

    

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        
    }
}
    
    