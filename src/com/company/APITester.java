package com.company;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

public class APITester {
    public static void main(String[] args) {
        HttpClient httpClient = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_2)
                .connectTimeout(Duration.ofSeconds(10))
                .build();
        try {
            HttpRequest request = HttpRequest.newBuilder()
                    .GET()
                    .uri(URI.create("https://www.google.com")) //requiere una url
                    .build();

            HttpResponse<String> response = httpClient.send(request,HttpResponse.BodyHandlers.ofString());

            System.out.println("Status code: " + response.statusCode());
            System.out.println("Headers: " + response.headers().allValues("content-type"));
            System.out.println("Body: " + response.body());
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}

/***
 * Cree una instancia de HttpClient usando la instancia de HttpClient.newBuilder ()
 *
 * Cree una instancia de HttpRequest utilizando la instancia de HttpRequest.newBuilder ()
 *
 * Realice una solicitud usando httpClient.send () y obtenga un objeto de respuesta.
 */


/***
 * Nueva forma de ejecutar el archivo
 * $ java APITester.java
 * Hello World!
 */

