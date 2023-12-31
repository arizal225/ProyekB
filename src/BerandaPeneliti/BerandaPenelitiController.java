package BerandaPeneliti;

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

public class BerandaPenelitiController implements Initializable {

    @FXML
    private Button home;
    
    @FXML
    private Button inputdata;

    @FXML
    private Button river;

    @FXML
    private Button ttgapk;

    @FXML
    private Button ttgdlh;

    @FXML
    private BorderPane mainPane;

    @FXML
    private Button logout;

    private Scene scene;

    private Stage stage;

    private Parent root;

    @FXML
    private void handleButtonRiver(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("InfoRiver.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setMaximized(true);
        stage.show();
    }

    @FXML
    private void handleButtonDlh(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("TtgDlh.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setMaximized(true);
        stage.show();
    }

    @FXML
    private void handleButtonApk(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("TtgApk.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setMaximized(true);
        stage.show();
    }

    @FXML
    private void handleButtonData(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("../tableview/InputData.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setMaximized(true);
        stage.show();
    }

    @FXML
    private void handleButtonHome(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("BerandaPeneliti.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setMaximized(true);
        stage.show();
    }

    @FXML
    private void handleButtonLogout(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("../Login/Login.fxml"));
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
    
    