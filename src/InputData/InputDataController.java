package InputData;

import java.net.URL;
import java.util.ResourceBundle;
import static javafx.collections.FXCollections.observableArrayList;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;

import javafx.scene.control.TextField;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class InputDataController implements Initializable{

    ObservableList<DataSungai> data = observableArrayList(
        new DataSungai("Winongo", "Yogyakarta", "25mg/l", "31 derajat", "Apa", "ya", "ya"),
        new DataSungai("Winongo", "Yogyakarta", "25mg/l", "31 derajat", "Apa", "ya", "ya"),
        new DataSungai("Winongo", "Yogyakarta", "25mg/l", "31 derajat", "Apa", "ya", "ya"),
        new DataSungai("Winongo", "Yogyakarta", "25mg/l", "31 derajat", "Apa", "ya", "ya"),
        new DataSungai("Winongo", "Yogyakarta", "25mg/l", "31 derajat", "Apa", "ya", "ya")
        );


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
    private TableColumn<DataSungai, String> kolomWarna;

    @FXML
    private Label labelHapus;

    @FXML
    private TableView<DataSungai> tableView;

    @FXML
    private TextField lokasi;

    @FXML
    private TextField luas;

    @FXML
    private TextField nama;

    @FXML
    private TextField panjang;

    @FXML
    private TextField suhu;

    @FXML
    private TextField kedalaman;

    @FXML
    private TextField textFieldHapus;

    @FXML
    private TextField warna;

    @FXML
    private void handleButtonTambah(ActionEvent event, Object data) {
    String Temp1 =  nama.getText();
    String Temp2 =  lokasi.getText();
    String Temp3 =  suhu.getText();
    String Temp4 =  luas.getText();
    String Temp5 =  panjang.getText();
    String Temp6 =  warna.getText();
    String Temp7 =  kedalaman.getText();
 

    DataSungai d = new DataSungai(Temp1, Temp2, Temp3, Temp4, Temp5, Temp6, Temp7);
        ((ObservableList<DataSungai>) data).add(d);
        nama.setText("");
        lokasi.setText("");
        suhu.setText("");
        luas.setText("");
        panjang.setText("");
        warna.setText("");
        kedalaman.setText("");
    }

   

    @FXML
    void hapus(ActionEvent event) {
        int ke_brp = Integer.parseInt(textFieldHapus.getText());
        int x = ke_brp - 1;
        data.remove(x);
        textFieldHapus.setText("");
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        kolomNama.setCellValueFactory(new PropertyValueFactory<DataSungai, String>("NamaSungai"));
        kolomLokasi.setCellValueFactory(new PropertyValueFactory<DataSungai, String>("LokasiSungai"));
        kolomSuhu.setCellValueFactory(new PropertyValueFactory<DataSungai, String>("SuhuSungai"));
        kolomLuas.setCellValueFactory(new PropertyValueFactory<DataSungai, String>("LuasSungai"));
        kolomPanjang.setCellValueFactory(new PropertyValueFactory<DataSungai, String>("PanjangSungai"));
        kolomWarna.setCellValueFactory(new PropertyValueFactory<DataSungai, String>("WarnaSungai"));
        kolomKedalaman.setCellValueFactory(new PropertyValueFactory<DataSungai, String>("KedalamanSungai"));
        tableView.setItems(data);
    }

}
