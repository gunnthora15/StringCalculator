# Cheat sheet


javac -cp "src/test/resources/junit-4.11.jar:classes/"  src/test/java/is/ru/stringcalculator/CalculatorTest.java -d classes
javac -cp "src/test/resources/junit-4.11.jar"  src/test/java/is/ru/stringcalculator/CalculatorTest.java -d classes
java -cp "src/test/resources/junit-4.11.jar:src/test/resources/hamcrest-core-1.3.jar:classes/" org.junit.runner.JUnitCore is.ru.stringcalculator.CalculatorTest
