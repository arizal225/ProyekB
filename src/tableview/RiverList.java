package tableview;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class RiverList {
    private ObservableList <DataSungai> dataList;

    public RiverList(){
        dataList = FXCollections.observableArrayList();
    }

    public ObservableList <DataSungai> getData(){
        return this.dataList;
    }
    
    public void setData(String x, String y, String z, String k, String l, String m){
        dataList.add(new DataSungai(x,y,z,k,l,m));
    }

    public void setDummy(){
        dataList = FXCollections.observableArrayList();
        dataList.add(new DataSungai("Winongo", "yogyakarta", "7", "30 derajat", "Coklat", "2022"));
        dataList.add(new DataSungai("Winongo", "yogyakarta", "4", "30 derajat", "Coklat", "2023"));
        dataList.add(new DataSungai("Winongo", "yogyakarta", "5", "30 derajat", "Coklat", "2024"));
    }
}
