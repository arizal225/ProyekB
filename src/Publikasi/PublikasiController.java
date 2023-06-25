package Publikasi;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class PublikasiController {

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

}