package br.com.fiap.winery;

import jakarta.jws.WebService;

@WebService(endpointInterface = "br.com.fiap.winery.WineStockService")
public class WineStockServiceImplementation implements WineStockService {

    @Override
    public String getMenu() {
        return "Vinho tinto, Vinho branco, Vinho rosé, Vinho espumante";
    }

    @Override
    public String placeOrder(String nome, int quantidade) {
        return "Pedido de " + quantidade + " " + nome + " confirmado!";
    }
}
