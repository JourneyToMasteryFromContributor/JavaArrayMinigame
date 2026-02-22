import java.util.Random;

public class ArrayProcessor {
    private double dividerInput;
    private int indexInput;
    private int[] numbers = new int[10];

    public ArrayProcessor(double dividerInput, int indexInput) {
        this.dividerInput = dividerInput;
        this.indexInput = indexInput - 1;
    }

    public void randomNumArray10() {
        Random randomNum = new Random();
        for (int i = 0; i < numbers.length; i++) {
            this.numbers[i] = randomNum.nextInt(100);             // Creates a random number from 0 to 99
        }
    }

    public int getRanNumFromArray() {
        return this.numbers[this.indexInput];
    }

    public double processArray() {
        return this.numbers[this.indexInput] / this.dividerInput;
    }
}

