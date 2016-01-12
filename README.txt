Project: 
Implementation:
The input to the application is an input string which is the search query.
The Search API is invoked using the search query.
The first item from search response list is used as an input to the Product Recommendation API to retrieve the recommended products
Reviews of 10 recommended products are retrived 
These reviews are ranked ordered and displayed. This is done by implementing a Comparator on ReviewStatistics

The application is developed in such a way that it would easily integrate an User Interface in future. 

 
Instructions to run:
The project is a maven project:

1) Launch a command promt in administrator mode
2) In the root folder of project Assignment
3) Run command: mvn compile
4) Run command: mvn package
5) Run command: java -jar target\WalmartAPIDemo-0.0.1-SNAPSHOT.jar
5) Enter the search query

Testing: JUnit tests are written to do the unit testing. These are run as part of mvn package.  