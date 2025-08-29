package br.com.fiap3espa;

import br.com.fiap3espa.service.Div;
import br.com.fiap3espa.service.Mult;
import br.com.fiap3espa.service.Sub;
import br.com.fiap3espa.service.Sum;
import jakarta.xml.ws.Endpoint;

public class Application {
    public static void main(String[] args) {
        System.out.println("Publicando API......................................");

        Endpoint.publish("http://localhost:8080/calculator/sum", new Sum());
        Endpoint.publish("http://localhost:8080/calculator/sub", new Sub());
        Endpoint.publish("http://localhost:8080/calculator/mult", new Mult());
        Endpoint.publish("http://localhost:8080/calculator/div", new Div());

        System.out.println("API Publicada com sucesso!!!!!!");
    }
}
