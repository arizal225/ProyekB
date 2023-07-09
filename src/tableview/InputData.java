/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tableview;

import java.net.URL;
import java.util.ResourceBundle;
import static javafx.collections.FXCollections.observableArrayList;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;

import javafx.scene.control.TextField;
import javafx.scene.control.TableView.TableViewSelectionModel;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class InputData implements Initializable {
    private TableViewSelectionModel selectionModel;
    private DataSungai selectedDataSungai;
    RiverList data;

    // deklarasi untuk objek di fxml
    @FXML
    private TableView<DataSungai> tableView;

    

    @FXML
    private TableColumn<DataSungai, String> kolomTahun;

    @FXML
    private TableColumn<DataSungai, String> kolomWarna;

    @FXML
    private TableColumn<DataSungai, String> kolomSuhu;

    @FXML
    private TableColumn<DataSungai, String> kolomPh;

    @FXML
    private TableColumn<DataSungai, String> kolomLokasi;

    @FXML
    private TableColumn<DataSungai, String> kolomNama;

    @FXML
    private Label labelHapus;

    @FXML
    private TextField textField1;

    @FXML
    private TextField textField2;

    @FXML
    private TextField textField3;

    @FXML
    private TextField textField4;

    @FXML
    private TextField textField5;

    @FXML
    private TextField textField6;

    @FXML
    private TextField textFieldHapus;

    @FXML
    private Button home;

    @FXML
    private Button info;

    @FXML
    private Button logout;

    @FXML
    private Button tentang;

    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private Button button;

    @FXML
    private Button hapus;
   
    @FXML
    private void save(ActionEvent event) {
        String text_nama = textField1.getText();
        String text_lokasi = textField2.getText();
        String text_ph = textField3.getText();
        String text_suhu = textField4.getText();
        String text_warna = textField5.getText();
        String text_tahun = textField6.getText();
        data.setData(text_nama, text_lokasi, text_ph, text_suhu, text_warna, text_tahun);
        RiverXML.saveData(data);
        textField1.setText("");
        textField2.setText("");
        textField3.setText("");
        textField4.setText("");
        textField5.setText("");
        textField6.setText("");
    }

    // @FXML
    // void hapus(ActionEvent event) {
    //     int ke_brp = Integer.parseInt(textFieldHapus.getText());
    //     int x = ke_brp - 1;
    //     data.remove(x);
    //     textFieldHapus.setText("");
    // }

    @FXML
    private void handleButtonHome (ActionEvent event) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("../BerandaPeneliti/BerandaPeneliti.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void handleButtonLogout (ActionEvent event) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("../Login/Login.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void handleButtonInformasi (ActionEvent event) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("../BerandaPeneliti/InfoRiver.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void handleButtonDlh (ActionEvent event) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("../BerandaPeneliti/TtgDlh.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    data = new RiverList();

        kolomNama.setCellValueFactory(new PropertyValueFactory<DataSungai, String>("Nama"));
        kolomLokasi.setCellValueFactory(new PropertyValueFactory<DataSungai, String>("Lokasi"));
        kolomPh.setCellValueFactory(new PropertyValueFactory<DataSungai, String>("Ph"));
        kolomSuhu.setCellValueFactory(new PropertyValueFactory<DataSungai, String>("Suhu"));
        kolomWarna.setCellValueFactory(new PropertyValueFactory<DataSungai, String>("Warna"));
        kolomTahun.setCellValueFactory(new PropertyValueFactory<DataSungai, String>("Tahun"));
        data.setDummy();
tableView.setItems(data.getData());
tableView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
tableView.getSelectionModel();

    }    

    
}
