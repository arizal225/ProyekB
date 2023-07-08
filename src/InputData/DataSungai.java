package InputData;

public class DataSungai {
    String kolomNama;
    String kolomLokasi;
    String kolomSuhu;
    String kolomLuas;
    String kolomPanjang;
    String kolomWarna;
    String kolomKedalaman;
    String kolomTahun;

    public DataSungai(String x, String y, String z, String i, String j, String k, String l, String m){
        this.kolomNama = x;
        this.kolomLokasi = y;
        this.kolomSuhu = z;
        this.kolomLuas = i;
        this.kolomPanjang = j;
        this.kolomWarna = k;
        this.kolomKedalaman = l;
        this.kolomTahun = m;
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

    public String getkolomTahun(){
        return kolomTahun;
    }
}
