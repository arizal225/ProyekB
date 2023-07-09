/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tableview;

import javafx.beans.property.SimpleStringProperty;

public class DataSungai {
    private SimpleStringProperty Nama;
   

private SimpleStringProperty Lokasi;
    private SimpleStringProperty  Ph;
  private SimpleStringProperty  Suhu;
    private SimpleStringProperty  Warna;
    private SimpleStringProperty Tahun;

    public DataSungai(){
        this("","","","","","");
        
    }
    
    public DataSungai(String x, String y, String z, String k, String l, String m){
        this.Nama = new SimpleStringProperty(x);
        this.Lokasi =new SimpleStringProperty(y);
        this.Ph = new SimpleStringProperty(z);
        this.Suhu = new SimpleStringProperty(k);
        this.Warna = new SimpleStringProperty(l);
        this.Tahun = new SimpleStringProperty(m);
    }
    
    public String getNama(){
        return Nama.get();
    }

    public void setNama(String n) {
        this.Nama.set(n);
    }


    
    public String getLokasi(){
        return Lokasi.get();
    }

     public void setLokasi(String l) {
        this.Lokasi.set(l);
    }

    public String getPh(){
        return Ph.get();
    }

     public void setPh(String p) {
        this.Ph.set(p);
    }

    public String getSuhu(){
        return Suhu.get();
    }

     public void setSuhu(String s) {
        this.Suhu.set(s);
    }

    public String getWarna(){
        return Warna.get();
    }

     public void setWarna(String w) {
        this.Warna.set(w);
    }

    public String getTahun(){
        return Tahun.get();
    }

     public void setTahun(String t) {
        this.Tahun.set(t);
    }
}
