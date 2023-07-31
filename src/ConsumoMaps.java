import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsumoMaps {

    private static final String CHAVE_API = "AIzaSyB3ssL6F2A0HQdX7MD8xp9CFuquXHB3fgw";
    private static final String URL_API = "https://maps.googleapis.com/maps/api/geocode/json";
    
    public static String mostrarNoMaps(String cep){

        String endereco = URL_API + "?address=" + cep + "&key=" + CHAVE_API;

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();

        HttpResponse <String> response;

        try {
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return response.body();
            
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
        return "";
    }
}
