package com.example;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSplitPaneUI;

import java.net.http.*;
import java.net.URI;

import java.util.*;


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
    
    String word = response.body();
    
    word=word.replace("[\"", "");
    word=word.replace("\"]", "");
    
    Map<String, Integer> wordList = new HashMap<>();

    int chances=4;

    Scanner scan = new Scanner(System.in);

    String guess="";
    int count=1;

    List<String> lettsInWord = new ArrayList<>();

    while(chances!=0){
        System.out.println("These are the letters you have guessed that are in the word");
        System.out.println(lettsInWord);
        System.out.println("");
        System.out.println("You have " + chances + " left to guess.");
        chances--;
        System.out.println("Take your guess of a word");
        System.out.println(word);
        guess=scan.nextLine();
        wordList.put(guess, count);
        count++;
        if(guess.equals(word)){System.out.println("You got it!");break;}
        else{
        strProcess.checkLetters(word,lettsInWord,guess);
        System.out.println("");
        System.out.println("These have been your guesses so far:");
        System.out.println(wordList);
        }
    }




    
    
    

    }
    catch(Exception e){
        e.printStackTrace();
    }
    }
}