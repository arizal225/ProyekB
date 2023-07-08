package InputData;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class InputDataController implements Initializable{

    ObservableList data = observableArrayList(
    new DataSungai ("Winongo", "apa", "4 Hari", "13", "Terima"),
    new DataSungai ("MCDonald'", "Fish Burger", "3 Hari", "28", "Tolak"),
    new DataSungai ("Rotiboy", "Choco Lava Boy", "3 Hari", "17", "Tolak"),
    new DataSungai ("Burger King", "Cheese Whopper", "3 Hari", "18", "Terima"),
    new DataSungai ("RotiO", "Chocolate Pastry", "3 Hari", "19", "Tolak")
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
    private TableColumn<DataSungai, String> kolomTahun;

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
    private TextField tahun;

    @FXML
    private TextField textFieldHapus;

    @FXML
    private TextField warna;

    @FXML
    private void handleButtonAction(ActionEvent event, Object data) {
    String Temp1 =  nama.getText();
    String Temp2 =  lokasi.getText();
    String Temp3 =  suhu.getText();
    String Temp4 =  luas.getText();
    String Temp5 =  panjang.getText();
    String Temp6 =  warna.getText();
    String Temp7 =  kedalaman.getText();
    String Temp8 =  tahun.getText();
 

    data.add(new DataSungai(Temp1, Temp2, Temp3, Temp4, Temp5, Temp7, Temp8));
        nama.setText("");
        lokasi.setText("");
        suhu.setText("");
        luas.setText("");
        panjang.setText("");
        warna.setText("");
        kedalaman.setText("");
        tahun.setText("");
    
    
    }

    private ObservableList observableArrayList(DataSungai dataSungai, DataSungai dataSungai2, DataSungai dataSungai3,
            DataSungai dataSungai4, DataSungai dataSungai5) {
        return null;
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
        kolomTahun.setCellValueFactory(new PropertyValueFactory<DataSungai, String>("TahunSungai"));
        tableView.setItems(data);
    }

}
