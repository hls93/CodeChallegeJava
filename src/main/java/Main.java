//package org.jsoup.examples;

import org.jsoup.Jsoup;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) throws IOException {

     //using Jsoup, I am connecting to the url and parsing through the html
     String webPage = "https://www.thespruce.com/worst-plants-for-allergies-4144982";

     String html = Jsoup.connect(webPage).get().html();

     Document doc = Jsoup.parse(String.valueOf(html));

     //extracting the text from the body of the webpage
     String text = doc.body().text();

     //creating a new list to show the words on the webpage and their frequency
     List<String> list = Arrays.asList(text.split(" "));
     Collections.sort(list);

     //creating a hashmap to store the word and its frequency
     HashMap<String, Integer> map = new HashMap<String, Integer>();

     for (int i = 0; i < list.size();) {
         String s = list.get(i);
         int count = list.lastIndexOf(s) - list.indexOf(s) +1;

         map.put(s, count);

         i = list.lastIndexOf(s) +1;
     }
        //System.out.println(map);


        map.entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .limit(25)
                .forEach(System.out::println);




}
}
