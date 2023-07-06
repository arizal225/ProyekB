package InputData;

public class DataSungai {
    String Nama;
    String Kontak;

    public DataSungai(){
        
    }
    
    public DataSungai(String x, String y){
        this.Nama = x;
        this.Kontak = y;
    }
    
    public String getNama(){
        return Nama;
    }
    
    public String getKontak(){
        return Kontak;
    }
}
