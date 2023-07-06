package Pilih;

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

public class PilihController implements Initializable {

    @FXML
    private Button pengguna;

    @FXML
    private Button peneliti;

    private Scene scene;

    private Stage stage;

    private Parent root;

    @FXML
    private void switchToBeranda(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("../Beranda/Beranda.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setMaximized(true);
        stage.show();
    }

    @FXML
    private void switchToPeneliti(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("../BerandaPeneliti/BerandaPeneliti.fxml"));
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
    
    