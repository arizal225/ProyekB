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

public class InformasiController implements Initializable{

    @FXML
    private Button winongo;

    @FXML
    private Button apk;

    @FXML
    private Button home;

    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    public void handleButtonAction (ActionEvent event) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Winongo.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void handleButtonActionA (ActionEvent event) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Opak.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void handleButtonActionB (ActionEvent event) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Progo.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void handleButtonActionC (ActionEvent event) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Chode.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void switchToHome (ActionEvent event) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("../Beranda/Beranda.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void switchToInformasi (ActionEvent event) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("../Informasi/Informasi.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    private void handleDlh (ActionEvent event) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Profiledlh.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    





     


    

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
        
    }

}