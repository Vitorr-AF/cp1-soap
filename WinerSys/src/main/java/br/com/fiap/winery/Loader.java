package br.com.fiap.winery;

import jakarta.xml.ws.Endpoint;

public class Loader {

    public static void main(String[] args) {
        WineStockServiceImplementation wineStock = new WineStockServiceImplementation();
        WineWarningService wineWarning = new WineWarningServiceImplementacion();


        Endpoint.publish("http://localhost:8085/WineStockService", wineStock);
        System.out.println("Serviço publicado!");

        Endpoint.publish("http://localhost:8085/WineWarningService", wineWarning);
        System.out.println("Serviço de warnig publicado!");
    }

}
