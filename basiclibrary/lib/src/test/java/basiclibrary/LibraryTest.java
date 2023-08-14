/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Arrays;


class LibraryTest {


    @Test
    void someLibraryMethodReturnsTrue() {
        Library classUnderTest = new Library();
/*
        assertTrue(classUnderTest.someLibraryMethod(), "someLibraryMethod should return 'true'");
*/
    }
    @Test public void testRoll() {
        Library sut = new Library();
        int result[] = sut.roll(3);
        Assertions.assertEquals(3, result.length);
    }
    @Test public void testAverage() {
        Library sut = new Library();
        double result = sut.average(new int[]{3, 1, 2});
        Assertions.assertEquals(2.0, result);
    }
    @Test public void testContainsDuplicates() {
        Library sut = new Library();
        boolean result =  sut.containsDuplicates(new int[]{});
        Assertions.assertEquals(false,result);
    }
    @Test public void testLowestAverageArray() {
        Library sut = new Library();
        int result[] = sut.lowestAverageArray(new int[][] {{1,2,3},{4,5,6},{1}});
        int expectedResult[]={1};
        Assertions.assertEquals(Arrays.toString(expectedResult),Arrays.toString(result));
    }

    @Test public void tetMinMaxTempResult(){
        Library sut = new Library();
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        ArrayList<Integer> resultFromMethod= sut.minMaxTemp(weeklyMonthTemperatures);
        ArrayList<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(72);
        expectedResult.add(51);
        expectedResult.add(63);
        expectedResult.add(67);
        expectedResult.add(68);
        expectedResult.add(69);
        Assertions.assertEquals(expectedResult,resultFromMethod); // compare the values of both list and must be in same order
    }
@Test public void testCreatUniqueSet() {
        Library sut = new Library();
    HashSet<Integer> methodResult = sut.createUniqueSet(new int[][]{{1,2,3},{1,4,5},{6,7,8}});
    Assertions.assertEquals(8,methodResult.size());
}
    @Test public void testTally() {
        List<String> votes = new ArrayList<>();
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Shrub");
        votes.add("Hedge");
        votes.add("Shrub");
        votes.add("Bush");
        votes.add("Hedge");
        votes.add("Bush");
        Library sut = new Library();
        String result = sut.tally(votes);
        Assertions.assertEquals("Bush",result);
    }



}

