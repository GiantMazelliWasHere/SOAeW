package br.com.fiap3espa.service;

import jakarta.jws.WebService;

@WebService(endpointInterface = "br.com.fiap3espa.service.Operations")
public class Sum implements Operations{

    @Override
    public String showName() {
        return "Soma";
    }

    @Override
    public String showSymbol() {
        return " + ";
    }

    @Override
    public double calculate(double x, double y) {
        return x + y;
    }

    @Override
    public String showMessage(double x, double y) {
        return "O resultado da " + showName()
                + " de " + x + showSymbol() + y + " é: " + calculate(x, y) + "!";
    }
}
