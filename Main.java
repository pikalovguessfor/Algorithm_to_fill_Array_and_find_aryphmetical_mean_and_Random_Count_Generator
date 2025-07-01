//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static int FindArithmeticalMean(int[] arr) {
        /*
        *Algorithm to find arithmetical mean in array
        */

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        sum = sum / arr.length;
        return sum;
    }

    public static void main(String[] args) {

        //Algorithm to create Array to filling and filing random count on it
        int[] ArrayToFill = new int[256];


        for (int i = 0; i < ArrayToFill.length; i++) {
            Random rand = new Random();
            int GenCount = rand.Rand();
            ArrayToFill[i] = GenCount;
        }
        //End of algorithm
        for (int i = 0; i < ArrayToFill.length; i++) {
            System.out.println(ArrayToFill[i]);
        }
        System.out.println("Arithmetical mean of Array = " + FindArithmeticalMean(ArrayToFill));

    }
}