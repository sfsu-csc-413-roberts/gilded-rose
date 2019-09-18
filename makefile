clean:
	rm -rf *.class

items: items/*.java
	javac items/*.java

test: clean items GildedRoseTest.java
	javac -cp .:junit-4.12.jar GildedRoseTest.java; java -cp .:junit-4.12.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore GildedRoseTest
