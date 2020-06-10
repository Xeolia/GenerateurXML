package main.java.io.gca.caps;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import io.gca.caps.PhoneDetails;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class LireFichierXML {
    public static void serializeToXML() {
        try {
            XmlMapper xmlMapper = new XmlMapper();

            // serialize our Object into XML string
            String xmlString = xmlMapper.writeValueAsString(new PhoneDetails("OnePlus", "6.4", "6/64 GB"));

            // write to the console
            System.out.println(xmlString);

            // write XML string to file
            File xmlOutput = new File("serialized.xml");
            FileWriter fileWriter = new FileWriter(xmlOutput);
            fileWriter.write(xmlString);
            fileWriter.close();
        } catch (JsonProcessingException e) {
            // handle exception
        } catch (IOException e) {
            // handle exception
        }
    }

    public static void main(String[] args) {
        System.out.println("Serializing to XML...");
        serializeToXML();
    }
}
