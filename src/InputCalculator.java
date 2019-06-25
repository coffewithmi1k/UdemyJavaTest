import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int sum = 0;
        int average = 0;

        while (true) {
            System.out.println("Please enter a number");
            boolean isInt = scanner.hasNextInt();


            if (isInt) {
                int number = scanner.nextInt();
                sum += number;
                counter++;


            } else {
                if(sum !=0 && counter !=0) {
                    average = sum / counter;
                }
                System.out.println("Sum = "+ sum +" AVG = " + average);
                break;
            }


        }
    }
}
