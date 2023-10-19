package org.example;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Getter;

import java.util.List;

@Getter

@JacksonXmlRootElement(localName = "atleta")
public class AtletaFemenina {
    @JacksonXmlProperty(isAttribute = true)
    private String nombre;
    @JacksonXmlProperty(isAttribute = true)
    private int edad;
    @JacksonXmlProperty(isAttribute = true)
    private String pais;
    @JacksonXmlElementWrapper(localName = "pruebas")
    @JacksonXmlProperty(localName = "prueba")
    private List<String> pruebas;
    public AtletaFemenina(String nombre, int edad, String pais, List<String> pruebas) {
        this.nombre = nombre;
        this.pruebas = pruebas;
        this.edad = edad;
        this.pais = pais;
    }
    public AtletaFemenina(){}

    @Override
    public String toString() {
        return "Atleta{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", país=" + pais +
                ", pruebas=" + pruebas +
                '}';
    }


}
