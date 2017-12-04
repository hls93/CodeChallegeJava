//package org.jsoup.examples;

import org.jsoup.Jsoup;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

     //using Jsoup, I am connecting to the url and parsing through the html
     String webPage = "https://www.thespruce.com/worst-plants-for-allergies-4144982";

     String html = Jsoup.connect(webPage).get().html();

     Document doc = Jsoup.parse(String.valueOf(html));

     //extracting the text from the body of the webpage
     String text = doc.body().text();

     //printing to make sure my extracting worked
     //System.out.println(text);

     //creating a new list to show the words on the webpage and their frequency
     List<String> list = Arrays.asList(text.split(" "));

     Set<String> topWords = new HashSet<String>(list);

        for (String word: topWords ) {

            if ()

            System.out.println(word + ": " + Collections.frequency(list, word));

        }






}
}
