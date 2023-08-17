/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;


class AppTest {
    @Test public void testReader1() {
        App sut = new App();
        String path=  "./src/test/resources/TwoErrors.txt";
        ArrayList<Integer> methodResult = sut.fileReader(path) ;
        ArrayList<Integer> expectedResult= new ArrayList<>();
        expectedResult.add(3);
        expectedResult.add(5);
        Assertions.assertEquals(expectedResult,methodResult); // only two warnings at line 3 and 5
    }
    @Test public void testReader2() {
        App sut = new App();
        String path=  "./src/test/resources/OneError.txt";
        ArrayList<Integer> methodResult = sut.fileReader(path) ;
        ArrayList<Integer> expectedResult= new ArrayList<>();
        expectedResult.add(5);
        Assertions.assertEquals(expectedResult,methodResult); // only one warning at line 5
    }
    @Test public void testReader3() {
        App sut = new App();
        String path=  "./src/test/resources/NOErrors.txt";
        ArrayList<Integer> methodResult = sut.fileReader(path) ;
        ArrayList<Integer> expectedResult= new ArrayList<>();
        Assertions.assertEquals(expectedResult,methodResult); // No warnings, file satisfy all conditions
    }
    @Test public void testReader4() {
        App sut = new App();
        String path=  "./src/test/resources/EmptyFile.txt";
        ArrayList<Integer> methodResult = sut.fileReader(path) ;
        ArrayList<Integer> expectedResult= new ArrayList<>();
        Assertions.assertEquals(expectedResult,methodResult); // No warnings, file is empty
    }
}
