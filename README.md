# Kata-String-Calculator-Java-8
##About
This project, take a List of number in a String for example "1+5-2" and do the math, for this String input it should return 4.


you should have maven installed.

##Examples
-	null => 0
-	"" => 0
-	"0" => 0
-	"1" => 1
-	"1+2" => 3
-	"2+4-1" => 5
-	"-10+3+1-2" => -8
-	"3++5--2" => 6

##Tests
After cloning the project


to starts standards test in your command line :
> mvn test

##Lunch
To start the app from your command line first you need to build the package
> mvn package


To start the app using your own string chain in your command line :
>mvn exec:java -Dexec.mainClass="com.Viseo.KataStringCalculator.Main"  -Dexec.args=""**your chain**""

##Enjoy!


