package Publikasi;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

/**
 * [Description PublikasiController]
 */
public class PublikasiController implements Initializable{

    @FXML
    private ListView<String> listSungai;

    @FXML
    private TextField namaSungai;

    @FXML
    void hapusData(MouseEvent event) {
        int selectedID = listSungai.getSelectionModel().getSelectedIndex();
        listSungai.getItems().remove(selectedID);

    }

    @FXML
    void tambahData(MouseEvent event) {
        listSungai.getItems().add(namaSungai.getText());

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
    }

}