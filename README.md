# web-crawler
This repository contains code implementation for simple Web Crawler demonstration as part of the assignment.

Jsoup java library is used for this purpose.Following Jsoup dependency snippet is added to pom.xml.
  
   ```<dependency>
        <groupId>org.jsoup</groupId>
        <artifactId>jsoup</artifactId>
        <version>1.7.2</version>
      </dependency>
   ```


##Guidelines to run this web-crawler standalone app:

 Clone the repository and follow the below simple steps to build this maven project and run

     `$mvn package`
       
     `$mvn install assembly:assembly`

 Now you will have the jar with dependencies in your target folder.

 Run the below java command by giving any URL as input argument

     `$java -cp target/web-crawler-1.0-SNAPSHOT-jar-with-dependencies.jar com.webcrawler.core.App <URL>`

     Example:

     `$java -cp target/web-crawler-1.0-SNAPSHOT-jar-with-dependencies.jar com.webcrawler.core.App http://wiprodigital.com/`

