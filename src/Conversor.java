import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Conversor {
    public MoedasExchangeRate conversorMoeda (String moeda1, String moeda2, double valor) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        String enderecoAPI = "https://v6.exchangerate-api.com/v6/3187f0a2c1fb26b3de1fc624/pair/" + moeda1 + "/" + moeda2 + "/" + valor;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(enderecoAPI))
                .build();
        try {
            HttpResponse<String> response = HttpClient
                    .newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());

            return gson.fromJson(response.body(), MoedasExchangeRate.class);

        } catch (Exception e) {
            throw new RuntimeException("Não consegui finalizar a conversão");
        }
    }
}
