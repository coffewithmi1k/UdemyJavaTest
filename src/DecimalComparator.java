public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double number1, double number2){
        int number3 =(int) Math.round(number1*1000);
        int number4 =(int) Math.round(number2*1000);
        System.out.println(number3+"   "+ number4);
        if(number3==number4){
            return true;
        }
        else{
            return false;
        }
    }
}
