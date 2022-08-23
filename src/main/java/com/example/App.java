package com.example;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import java.net.http.*;
import java.net.URI;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try{
        HttpRequest request = HttpRequest.newBuilder()
		.uri(URI.create("https://random-words5.p.rapidapi.com/getMultipleRandom?count=1&wordLength=5"))
		.header("X-RapidAPI-Key", "5c5dee7e48msh2bd5403364d5932p1aa67djsnfc2e6c50ff3c")
		.header("X-RapidAPI-Host", "random-words5.p.rapidapi.com")
		.method("GET", HttpRequest.BodyPublishers.noBody())
		.build();
HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
    System.out.println(response.body());
    String word = response.body();
    word.replace("[","");
    
    
    

    }
    catch(Exception e){
        e.printStackTrace();
    }
    }
}