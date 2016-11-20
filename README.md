JSoup-Extract
=============

JSoup-extract is a fork from Jsoup by Jonathan Hendley. This fork is intendend to provide the additional features:

* Template removal from multiple documents
* Provide equals and hashcode for Elements

## Maven dependencies

First you need to setup the server in your pom.xml :


    <repositories>
      <repository>
        <id>inferray-mvn-repo</id>
        <url>https://raw.github.com/jsubercaze/jsoup-extract/mvn-repo/</url>
        <snapshots>
            <enabled>true</enabled>
            <updatePolicy>always</updatePolicy>
        </snapshots>
      </repository>
    </repositories>

Then use the following dependency :

    <dependency>
      <groupId>org.jsoup</groupId>
      <artifactId>jsoup-extract</artifactId>
      <version>1.9.3-SNAPSHOT</version>
    </dependency>


## Template removal

Jsoup-extract allows to remove the commons elements of multiple documents in order to retain only valuable information. 
This allows to efficiently remove menus and template elements, while keeping the structural information that can be used for
later extraction. If you aim at extracting the textual content of an HTML document, 
use [https://github.com/kohlschutter/boilerpipe](boiilerpipe)

Original Readme
===============

jsoup: Java HTML parser that makes sense of real-world HTML soup.

jsoup is a Java library for working with real-world HTML. It provides a very convenient API for extracting and manipulating data, using the best of DOM, CSS, and jquery-like methods.

jsoup implements the WHATWG HTML5 specification (http://whatwg.org/html), and parses HTML to the same DOM as modern browsers do.

* parse HTML from a URL, file, or string
* find and extract data, using DOM traversal or CSS selectors
* manipulate the HTML elements, attributes, and text
* clean user-submitted content against a safe white-list, to prevent XSS
* output tidy HTML

jsoup is designed to deal with all varieties of HTML found in the wild; from pristine and validating, to invalid tag-soup; jsoup will create a sensible parse tree.

jsoup runs on Java 1.5 and up.

See https://jsoup.org/ for downloads and documentation.
