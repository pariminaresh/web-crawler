package com.webcrawler.core;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

/**
 * This is simple Web Crawler for the given use case given by Wipro Team as part of assesment.
 *
 * Input URL : http://wiprodigital.com/
 * 
 * Output : Links to other pages, Links to statis pages like images
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println("\n Hello! Welcome to the web crawler demonstration as part of the Wipro assignment \n" );
        
        if(args.length==0 || args.length>1){
        	System.err.println("Example Usage:: java -cp target/web-crawler-1.0-SNAPSHOT-jar-with-dependencies.jar com.webcrawler.core.App http://wiprodigital.com/");
        	return;
        }

        crawlerController(args[0]);
    }

    public static void crawlerController(String URL) throws IOException {
    	System.out.println("START of WebCrawler for the given URL: "+URL);
    	Document doc = Jsoup.connect(URL).get();

    	Elements links = doc.select("a[href]");
        Elements media = doc.select("[src]");
        Elements externalLinks = doc.select("link[href]");
        
        System.out.println("\n----List of links to other pages----\n");
        for(Element e: links){
        	System.out.println(e.attr("abs:href"));
        }
 
        System.out.println("\n----List of static images ----\n");
        for(Element e: media){
        	if(e.tagName().equals("img")){
        	   System.out.println(e.attr("abs:src"));
        	  }
        }

        System.out.println("\n----List of links to imports----\n");
        for(Element e: externalLinks){
        	System.out.println(e.attr("abs:href"));
        }
    }
}
