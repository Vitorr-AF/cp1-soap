package br.com.fiap.winery;

import br.com.fiap.winery.stubclasses.WineStockService;
import br.com.fiap.winery.stubclasses.WineWarningService;
import jakarta.xml.ws.Service;

import javax.xml.namespace.QName;
import java.net.MalformedURLException;
import java.net.URL;

public class ApplicationClient2 {
    public static void main(String[] args) throws MalformedURLException {
        final String TARGET = "http://winery.fiap.com.br/";

        final String WSDL1 = "http://localhost:8085/WineStockService?wsdl";
        final String NAME1 = "WineStockServiceImplementationService";

        final String WSDL2 = "http://localhost:8085/WineWarningService?wsdl";
        final String NAME2 = "WineWarningServiceImplementacionService";

        URL url1 = new URL(WSDL1);
        QName qName1 = new QName(TARGET,NAME1);
        Service service1 = Service.create(url1,qName1);

        URL url2 = new URL(WSDL2);
        QName qName2 = new QName(TARGET,NAME2);
        Service service2 = Service.create(url2,qName2);




        WineStockService wineStockService = service1.getPort(WineStockService.class);
        String order = wineStockService.placeOrder("Vinho tinto", 5);
        System.out.println(order);

        WineWarningService wineWarningService = service2.getPort(WineWarningService.class);
        String warn = wineWarningService.sendWarn(0);
        System.out.println(warn);
    }
}
