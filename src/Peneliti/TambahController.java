package Peneliti;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class TambahController {

    @FXML
    private Button button;

    @FXML
    private Button hapus;

    @FXML
    private TableColumn<DataSungai, String> kolomKedalaman;

    @FXML
    private TableColumn<DataSungai, String> kolomLokasi;

    @FXML
    private TableColumn<DataSungai, String> kolomLuas;

    @FXML
    private TableColumn<DataSungai, String> kolomNama;

    @FXML
    private TableColumn<DataSungai, String> kolomPanjang;

    @FXML
    private TableColumn<DataSungai, String> kolomSuhu;

    @FXML
    private TableColumn<DataSungai, String> kolomTahun;

    @FXML
    private TableColumn<DataSungai, String> kolomWarna;

    @FXML
    private Label labelHapus;

    @FXML
    private TableView<DataSungai> tableView;

    @FXML
    private TextField textField1;

    @FXML
    private TextField textField2;

    @FXML
    private TextField textField21;

    @FXML
    private TextField textField22;

    @FXML
    private TextField textField221;

    @FXML
    private TextField textField2211;

    @FXML
    private TextField textField2212;

    @FXML
    private TextField textField2213;

    @FXML
    private TextField textFieldHapus;

    @FXML
    private void handleButtonAction(ActionEvent event, Object data) {
        String text_nama = textField1.getText();
        String text_lokasi = textField2.getText();
        String text_suhu = textField21.getText();
        String text_luas = textField22.getText();
        String text_panjang = textField221.getText();
        String text_warna = textField2211.getText();
        String text_kedalaman = textField2212.getText();
        String text_tahun = textField2213.getText();
        data.add(new DataSungai(text_nama, text_lokasi));
        textField1.setText("");
        textField2.setText("");
        textField21.setText("");
        textField22.setText("");
        textField221.setText("");
        textField2211.setText("");
        textField2212.setText("");
        textField2213.setText("");

    }

    @FXML
    void hapus(ActionEvent event) {

    }

}
