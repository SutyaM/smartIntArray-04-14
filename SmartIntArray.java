
import java.util.Arrays;

public class SmartIntArray {

    private int[] array;

    public int arrayMin;
    public int arrayMax;
    public double arrayAverage;
    public int arraySum;

    private int arrayMin() {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    private int arrayMax() {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    private double arrayAverage() {
        double avg = (double)arraySum() / array.length;
        return avg;
    }

    private int arraySum() {
        int num = 0;
        for (int i = 0; i < array.length; i++) {
            num += array[i];
        }
        return num;
    }

    public SmartIntArray(int[] array) {
        this.array = array;
        this.arrayAverage = arrayAverage();
        this.arrayMax = arrayMax();
        this.arrayMin = arrayMin();
        this.arraySum = arraySum();
    }

    @Override
    public String toString() {
        return "SmartIntArray{" +
                "testArray=" + Arrays.toString(array) +
                ", arrayMin=" + arrayMin +
                ", arrayMax=" + arrayMax +
                ", arrayAverage=" + arrayAverage +
                ", arraySum=" + arraySum +
                '}';
    }
}
