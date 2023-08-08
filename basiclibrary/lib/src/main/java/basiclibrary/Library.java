/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;
import java.util.HashSet;
public class Library {
    public boolean someLibraryMethod() {
        return true;
    }

    public int[] roll(int n) {
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=(int)(Math.random()*5)+1;
        }
        return arr;
    }
    public boolean containsDuplicates(int arr[]) {
        HashSet<Integer> uniqeSet=new HashSet<Integer>();
        for (int i : arr) {
                if (uniqeSet.contains(i))
                    return true;
                uniqeSet.add(i);
        }
        return false;
    }

    public double average(int arr[]) {
        int sum=0;
        for(int i:arr)
            sum+=i;
       return (double) sum/arr.length;
    }
    public int[] lowestAverageArray(int arr[][]) {
        int lowestAvgIndex=0;
        double sum=0;
        double lastAvg=0;
        for (int i =0 ; i<arr.length;i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            double avg = sum / arr[i].length;
            if (i == 0 || avg < lastAvg) {
                lastAvg = avg;
                lowestAvgIndex = i;
            }
            sum=0;
        }
        return arr[lowestAvgIndex];
    }
}