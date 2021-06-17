package me.koba1.wynntilsapi;

import org.json.JSONObject;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class request {

    private static JSONObject JSONresponse;

    public static JSONObject get(String endpoint) {
        String url = "https://athena.wynntils.com/cache/get/" + endpoint;
        URLConnection connection = null;
        try {
            connection = new URL(url).openConnection();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (Scanner scanner = new Scanner(connection.getInputStream())) {
            try {
                String response = scanner.useDelimiter("\\A").next();
                JSONresponse = new JSONObject(response);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return JSONresponse;
    }
}
