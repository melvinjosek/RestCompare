Summary:
The Project is build using Maven. The solution is in the class'RestCompare.java'.

Before Running :
Below are the prerequisites for running the project:
1.Java 8
2.Maven Installation

Steps to Run :
1. Unzip or clone the project to a local location.
2. Place the Http Request files under 'src\main\resources'
3. Open command prompt in the project root folder location.
4. Execute in command prompt 'mvn clean install' to build the project.
5. Execute the command ‘mvn exec:java’ to trigger the main class(RestCompare.java already defined as main class in pom file).


Notes:
1.To view the source code, the project can be opened as maven project in Eclipse/IntelliJ.
2.The project contains another class called 'JsonCompare.java'. This may be used to compare 2 json files directly. Files need to be placed under 'src\main\resources'.
Also pom.xml needs to be edited to enable this."<exec.mainClass>solution.RestCompare</exec.mainClass>" needs to be changed to "<exec.mainClass>solution.JsonCompare</exec.mainClass>".

