package org.example;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class OperacionesXML {

    public static void escribirListaObjetosXml(List<AtletaFemenina> atletas, Path ruta) {
        try {
            Files.deleteIfExists(ruta);
            XmlMapper xmlMapper = new XmlMapper();
            xmlMapper.writeValue(ruta.toFile(), atletas);
        } catch (IOException e) {
            System.out.println("El fichero no existe");
        }
    }

    public static List<AtletaFemenina> leerArrayObjetosXml(Path ruta) {
        try {
            XmlMapper xmlMapper = new XmlMapper();
            return xmlMapper.readValue(ruta.toFile(), new TypeReference<>() { });
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
