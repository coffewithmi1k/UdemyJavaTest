import java.sql.SQLOutput;
import java.util.Scanner;

public class MinAndMaxInputChallenge {

    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        boolean first = true;
        int min = 0;
        int max = 0;

        while (true) {
            System.out.println("Enter First Number");
            boolean isInt = scanner.hasNextInt();

            if (isInt) {
                int number = scanner.nextInt();

                if(first){
                    first=false;
                    max= number;
                    min= number;
                }
                if(min>number){
                    min =number;
                }
                if(max<number){
                    max = number;
                }

            }
            else{
                System.out.println("min Number is "+min+" Max number is "+max);
                break;
            }

        }
        scanner.close();
    }


}
