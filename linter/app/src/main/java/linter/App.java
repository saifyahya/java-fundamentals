/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linter;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

fileReader();
    }
    public static void fileReader() {
        try {
            Path filePath =Path.of("./app/src/main/resources/gates.txt");
            Scanner reader = new Scanner(filePath);
            int lineNumber=0;
            while (reader.hasNextLine()){
                lineNumber++;
            String line = reader.nextLine();
            if(line.isEmpty()||line.endsWith("{")||line.endsWith("}")||line.endsWith("if")||line.endsWith("else")||line.endsWith(";"))
                    continue;
                System.out.println("this line "+lineNumber+ ": does not end with semicolon");
            }
            reader.close();
        }catch (IOException e) {
            e.printStackTrace();
        }

    }

}