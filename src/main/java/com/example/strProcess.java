package com.example;
import java.util.*;

public class strProcess {
    
    public static void checkLetters(String word, List<String> list, String guess){
        String[] wordSplit = word.split("");
        String[] guessSplit = guess.split("");

        List<String> wordList = new ArrayList<String>(Arrays.asList(wordSplit));
        List<String> guessList = new ArrayList<String>(Arrays.asList(guessSplit));


         for(int i=0; i<guessList.size(); i++){
            String letter = guessList.get(i);
           if(wordList.contains(letter)){
            if(!list.contains(letter)){
                list.add(letter);
            }
           }
         }
    }



}
