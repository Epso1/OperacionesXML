package org.example;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        AtletaFemenina atleta1 = new AtletaFemenina("Maria Martinez", 24, "España", List.of("100m", "Salto de altura"));
        AtletaFemenina atleta2 = new AtletaFemenina("Sonia Ferrer", 14, "Argentina", List.of("1000m", "110m vallas"));

        List<AtletaFemenina> atletas = List.of(atleta1, atleta2);

        OperacionesXML.escribirListaObjetosXml(atletas, Path.of(".", "src", "main", "java","org","example", "atletas.xml" ));

        List<AtletaFemenina> atletasDeserializadas = OperacionesXML.leerArrayObjetosXml(Path.of(".", "src", "main", "java","org","example", "atletas.xml" ));

        atletasDeserializadas.forEach(System.out::println);

    }
}