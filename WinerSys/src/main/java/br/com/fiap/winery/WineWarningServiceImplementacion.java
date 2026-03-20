package br.com.fiap.winery;

import jakarta.jws.WebService;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@WebService(endpointInterface = "br.com.fiap.winery.WineWarningService")
public class WineWarningServiceImplementacion implements WineWarningService {
    @Override
    public String sendWarn(int id) {
        ArrayList<String> itens = new ArrayList<>(List.of("Vinho tinto", "Vinho branco", "Vinho rosé", "Vinho espumante"));
        String item = itens.get(id);
        return String.format("Estoque de %s insuficiente!", item);
    }
}
