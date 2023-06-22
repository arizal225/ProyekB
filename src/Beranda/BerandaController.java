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

    private Scene scene;

    private Stage stage;

    private Parent root;
    
    @FXML
    private void switchToPublikasi(ActionEvent event) throws IOException{
        // 1. Baca file fxml
        Parent root = FXMLLoader.load(getClass().getResource("../Publikasi/Publikasi.fxml"));

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

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'initialize'");
    }
}
    
    