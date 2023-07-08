package InputData;

public class DataSungai {
    String kolomNama;
    String kolomLokasi;
    String kolomSuhu;
    String kolomLuas;
    String kolomPanjang;
    String kolomWarna;
    String kolomKedalaman;

    
    

    public DataSungai(String string, String string2, String string3, String string4, String string5, String string6, String string7) {

        this.kolomNama = string;
        this.kolomLokasi = string2;
        this.kolomSuhu = string3;
        this.kolomLuas = string4;
        this.kolomPanjang = string5;
        this.kolomWarna = string6;
        this.kolomKedalaman = string7;
    }

    public String getkolomNama(){
        return kolomNama;
    }

    public String getkolomLokasi(){
        return kolomLokasi;
    }

    public String getkolomSuhu(){
        return kolomSuhu;
    }

    public String getkolomLuas(){
        return kolomSuhu;
    }

     public String getkolomPanjang(){
        return kolomPanjang;
    }

    public String getkolomWarna(){
        return kolomWarna;
    }

    public String getkolomKedalaman(){
        return kolomKedalaman;
    }
}
