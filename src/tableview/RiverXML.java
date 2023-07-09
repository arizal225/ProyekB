package tableview;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.StandardCharsets;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.thoughtworks.xstream.security.NoTypePermission;

public class RiverXML {
   private static final String XML_FILE_PATH = "river_data.xml";

    public static void saveData(RiverList data) {
        XStream xstream = new XStream(new DomDriver());
        String xml = xstream.toXML(data);
        try (Writer writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream(XML_FILE_PATH), StandardCharsets.UTF_8))) {
            writer.write(xml);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static RiverList loadData() {
        XStream xstream = new XStream(new DomDriver());
    
        // Allow the deserialization of the RiverList class
        xstream.addPermission(NoTypePermission.NONE);
        xstream.allowTypeHierarchy(RiverList.class);
    
        // Allow the deserialization of the ObservableListWrapper class
        xstream.allowTypesByWildcard(new String[] {
            "com.sun.javafx.collections.ObservableListWrapper",
            "com.sun.javafx.collections.ListListenerHelper$Generic"
        });
    
        File xmlFile = new File(XML_FILE_PATH);
        if (xmlFile.exists()) {
            try (Reader reader = new BufferedReader(new InputStreamReader(
                    new FileInputStream(XML_FILE_PATH), StandardCharsets.UTF_8))) {
                return (RiverList) xstream.fromXML(reader);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return new RiverList();
    }
    
    
}
