package Utils;

import java.net.URL;

import Main.Main;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

public class OpenScene {
    private static Pane halaman;
    
    public static  Pane getPane(String path){
        try{
            URL fileHalaman=Main.class.getResource(path + ".fxml");
            
            if(fileHalaman==null){
                throw new java.io.FileNotFoundException("Halaman tidak ditemukan");
            }
            
            halaman=new FXMLLoader().load(fileHalaman);
            
        }catch (Exception e){
            System.out.println("Tidak ditemukan halaman tersebut");
        }
        
        return halaman;
    }
}
