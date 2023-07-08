package TentangDlh;

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

public class TentangDlhController implements Initializable{

    @FXML
    private Button out;

    @FXML
    private Button hom;

    @FXML
    private Button info;

    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    public void handleButtonHom (ActionEvent event) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("../Beranda/Beranda.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void handleButtonInfo (ActionEvent event) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("../Informasi/Informasi.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void handleButtonOut (ActionEvent event) throws Exception {
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