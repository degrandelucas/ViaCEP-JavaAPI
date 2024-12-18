package cep.connection;

import cep.dto.InfoCEP;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class Connection {

    public static InfoCEP requestCEP(String cep) {
        HttpClient client = HttpClient.newBuilder().build();
        String urlAPI = "https://viacep.com.br/ws/" + cep + "/json/";
        try {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(urlAPI)).GET()
                    .build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), InfoCEP.class);
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("CEP nao encontrado");
        }
    }
}
