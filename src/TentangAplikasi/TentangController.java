package TentangAplikasi;

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

public class TentangController implements Initializable{

    @FXML
    private Button keluar;

    @FXML
    private Button dlh;

    @FXML
    private Button rumah;

    @FXML
    private Button sungai;

    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    public void handleButtonRumah (ActionEvent event) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("../Beranda/Beranda.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void handleButtonSungai (ActionEvent event) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("../Informasi/Informasi.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

     @FXML
    private void handleButtonDlh (ActionEvent event) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("../Informasi/Informasi.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void handleButtonKeluar (ActionEvent event) throws Exception {
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