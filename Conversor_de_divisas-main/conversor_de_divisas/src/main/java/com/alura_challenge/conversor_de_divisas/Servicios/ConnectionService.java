package com.alura_challenge.conversor_de_divisas.Servicios;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.springframework.stereotype.Service;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Service
public class ConnectionService {
    //Conexion y respuesta de API
    HttpClient client = HttpClient.newHttpClient();
    HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create("https://v6.exchangerate-api.com/v6/85880998f1c1fe9b71e4ccb5/latest/USD"))
            .build();
    //Respuesta API
    String jsonrespuesta = client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
            .thenApply(HttpResponse::body)
            .join();
    JsonObject jsonObject = JsonParser.parseString(jsonrespuesta).getAsJsonObject();
    JsonObject conversionRates = jsonObject.getAsJsonObject("conversion_rates");
        public double pesoArgentino = conversionRates.get("ARS").getAsDouble();
        public double realBrasileño = conversionRates.get("BRL").getAsDouble();
        public double pesoColombiano = conversionRates.get("COP").getAsDouble();

    }
