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
    private Button input;

    @FXML
    private Button publikasi;

    @FXML
    private BorderPane mainPane;

    private Scene scene;

    private Stage stage;

    private Parent root;

    @FXML
    private void switchToData(ActionEvent event) throws IOException{
        mainPane.setCenter(OpenScene.getPane("../InputData/InputData"));
    }

    

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        if(mainPane.getCenter() == null){
            mainPane.setCenter(OpenScene.getPane("../InputData/Data"));
        }
    }
}
    
    