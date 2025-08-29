package br.com.fiap3espa.service;

import com.oracle.xmlns.webservices.jaxws_databinding.SoapBindingStyle;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)

public interface Operations {

    @WebMethod
    String showName();

    @WebMethod
    String showSymbol();

    @WebMethod
    double calculate(double x, double y);

    @WebMethod
    String showMessage(double x, double y);

}
