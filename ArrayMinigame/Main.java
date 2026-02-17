import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter an index including between 1 and 10: ");
        int indexInput = scan.nextInt();

        System.out.print("Please enter a divider: ");
        double dividerInput = scan.nextDouble();

        ArrayProcessor array1 = new ArrayProcessor(dividerInput, indexInput);
        array1.randomNumArray10();

        try {
            System.out.println("Number: " + array1.getRanNumFromArray() + " Divided by " + dividerInput + " = " + array1.processArray());
        } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Outside of array.");
        } catch (ArithmeticException e) { // Included although doubles can handle it, I just want to add it for future reference for int.
            System.out.println("Cannot divide by 0");
        }
        finally {
            System.out.println("Operation complete.");
        }
    }
}
